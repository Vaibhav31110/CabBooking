# Cab Booking API

This project is a Spring Boot application that provides a REST API for managing cab bookings. It includes functionality for creating, retrieving, and updating cab booking information.

## Features

- Create a cab booking
- Retrieve a cab booking by Trip ID
- Update a cab booking

## Technologies Used

- **Java**: Backend programming language
- **Spring Boot**: Framework for creating the REST API
- **Jakarta Persistence API (JPA)**: For entity mapping
- **Postman**: API testing

## Prerequisites

- **Java Development Kit (JDK)**: Version 17 or later
- **Maven**: For dependency management
- **Postman**: For API testing (optional)
- **Spring Boot**: Installed via Maven dependencies

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd cab-booking-api
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

4. Access the API at `http://localhost:2090/bookings`.

## API Endpoints

### Create a Booking
- **Method**: `POST`
- **URL**: `/bookingsave`
- **Request Body**:
  ```json
  {
    "tripid": 101,
    "mobileNumber": 9876543210,
    "pickUpLocation": "Downtown",
    "dropOffLocation": "Airport",
    "isCancelled": false
  }
  ```
- **Response**:
  - **201 Created**: Booking created successfully.
  - **409 Conflict**: Trip ID already exists.

### Retrieve a Booking
- **Method**: `GET`
- **URL**: `/bookings/{tripid}`
- **Response**:
  - **200 OK**: Returns the booking details.
  - **404 Not Found**: Booking not found.

### Update a Booking
- **Method**: `PUT`
- **URL**: `/bookingsupdate/{tripid}`
- **Request Body**:
  ```json
  {
    "mobileNumber": 9876543210,
    "pickUpLocation": "City Center",
    "dropOffLocation": "Hotel",
    "isCancelled": true
  }
  ```
- **Response**:
  - **200 OK**: Booking updated successfully.
  - **404 Not Found**: Booking not found.

## Testing the API

Use Postman or a similar tool to test the API endpoints:

1. **POST**: Create a new booking by sending a JSON body.
2. **GET**: Retrieve a booking by replacing `{tripid}` with the Trip ID.
3. **PUT**: Update an existing booking by providing the Trip ID and new details in the JSON body.

## Entity Structure

### CabBooking
```java
@Entity
public class CabBooking {

    @Id
    private int tripid;

    @Column(name = "MobileNumber")
    private Long mobileNumber;

    @Column(name = "PickUpLocation")
    private String pickUpLocation;

    @Column(name = "DropOffLocation")
    private String dropOffLocation;

    @Column(name = "IsCancelled")
    private Boolean isCancelled;

    // Getters, setters, and toString method
}
```

## Future Enhancements

- Add database integration using Spring Data JPA.
- Implement DELETE endpoint to cancel a booking.
- Add authentication and authorization.
- Provide pagination and sorting for retrieving bookings.

## License

This project is licensed under the MIT License. See the LICENSE file for details.

## Contact

For questions or support, please contact:
- **Developer**: [Your Name]
- **Email**: [your-email@example.com]

