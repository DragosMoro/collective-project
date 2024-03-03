# CharityHub

## Introduction

This project represents a collaborative endeavor involving 9 students with the goal of optimizing donations to NGOs in Romania. The platform developed allows users to browse various NGOs and decide where to allocate their contributions, whether in monetary form or through donations of goods such as food and clothing. The project employed a range of technologies across frontend, backend, versioning, and project management, including:

### Frontend Technologies:
- TypeScript
- React
- Tailwind CSS
- Google API
- Stripe

### Backend Technologies:
- Spring Boot
- Java
- Liquibase
- Swagger
- Docker
- PostgreSQL

### Versioning and Project Management:
- Git
- GitHub
- Jira Project Management

## Features

### 1. User Authentication

#### Description:
- Users can securely create profiles and log in.

#### Screenshot:

![User Authentication](authentication_image_url_here)

### 2. Main Page

#### Description:
- Displays a comprehensive list of available NGOs, gathered through web scraping.
- Users can mark NGOs as favorites and directly contact them for donations.

#### Screenshot:

![Main Page](main_page_image_url_here)

### 3. Contact Page

#### Description:
- Provides a form for users to contact NGOs.

#### Screenshot:

![Contact Page](contact_page_image_url_here)

### 4. Donation Page

#### Description:
- Enables users to donate money securely through a form integrated with Stripe.
- Facilitates the donation of items by directing users to a form to notify the NGO of their donation plans.

#### Screenshots:

##### Donate Money:

![Donate Money Page](donate_money_image_url_here)

##### Donate Items:

![Donate Items Page](donate_items_image_url_here)

### 5. Transaction History

#### Description:
- Presents a detailed overview of all transactions and donations made.

#### Screenshot:

![Transaction History](transaction_history_image_url_here)

### 6. Edit Profile

#### Description:
- Allows users to modify their profile information.

#### Screenshot:

![Edit Profile](edit_profile_image_url_here)


# Architecture

The application consists of two modules: frontend and backend (server), making maintenance easier. 

## Server Architecture
- Follows GRASP architecture with domain, repository, service, and controller.
- Uses Spring Framework for its functionalities and prebuilt functions.
- Liquibase ensures database consistency.
- Stripe is used for payments.

## Client Architecture
- Follows MVC architecture with Model, View, and Controller, utilizing React.

## Design Decisions

- Figma used for UI/UX mockups.
- Radix UI with React chosen for design implementation.

## Local Development

### Database
- Utilizes a Docker container described in `docker-compose.yaml`.


## Future Developments

- Add account recovery option.
- Sort and filter items on the backend.
- Implement additional filtering.
- Expand NGO database to international level.

