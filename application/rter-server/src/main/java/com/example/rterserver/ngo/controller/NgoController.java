package com.example.rterserver.ngo.controller;

import com.example.rterserver.common.ResponseDto;
import com.example.rterserver.ngo.model.Ngo;
import com.example.rterserver.ngo.service.NgoService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ngos")
@OpenAPIDefinition(info = @Info(title = "NGO API", version = "v1"))
@Validated
public class NgoController {
    private final NgoService ngoService;

    @Autowired
    public NgoController(NgoService ngoService) {
        this.ngoService = ngoService;
    }

    @Operation(summary = "Fetch NGOs", description = "This endpoint is used to fetch NGOs. " +
            "Enter how many NGOs you want to fetch. The number must be a multiple of 10. " +
            "Otherwise, the number will be rounded up to the next multiple of 10.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "NGOs found successfully",
                    content = {@Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Ngo.class)))}),
            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = ResponseDto.class))})
    })
    @GetMapping
    public ResponseEntity<List<Ngo>> fetchNgos(
            @Parameter(description = "Number of NGOs (multiple of 10)")
            @RequestParam(defaultValue = "10") @Min(10) @Max(100) int nrOfNGOs
    ) {
        List<Ngo> ngos = ngoService.fetchNGOs(nrOfNGOs);
        return ResponseEntity.ok(ngos);
    }
}