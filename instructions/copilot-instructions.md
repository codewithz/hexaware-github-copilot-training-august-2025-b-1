# GitHub Copilot Instructions for Spring Boot Java Coding

## 🧭 Purpose
This document provides instructions for GitHub Copilot to follow consistent coding standards when generating Java code for Spring Boot applications. These guidelines ensure the code is readable, maintainable, and follows common Spring development practices.

---

## ⚙️ General Guidelines

1. Use 4 spaces per indentation level.
2. Follow proper Java naming conventions and structure.
3. Include Javadoc-style comments for public classes and methods.
4. Avoid unused imports and redundant code.
5. Keep class files focused — one public class per file.

---

## 🧪 Structure and Layering

1. Follow standard Spring Boot layer separation:
   - `controller` for REST APIs
   - `service` for business logic
   - `repository` for database access
   - `model` or `entity` for data classes
2. Use dependency injection with `@Autowired` or constructor injection.
3. Avoid placing business logic in the controller layer.

---

## 🔤 Naming Conventions

- Use **camelCase** for variables and methods.
- Use **PascalCase** for class names.
- Prefix interfaces with meaningful names (e.g., `UserService`, `ProductRepository`).
- Suffix controller classes with `Controller`.

---

## 📦 Import Statements

- Always place imports at the top of the file.
- Organize them as:
  1. `java.*`, `javax.*` imports
  2. Third-party libraries (e.g., Spring Framework, Lombok)
  3. Internal project imports
- Remove unused imports before committing.

---

## 🌐 API Example Style (Injecting Copilot-Generated Code)

```java
@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    /**
     * Retrieve all customers from the system.
     *
     * @return HTTP 200 with the list of customers
     */
    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }
}
```

✅ Follows best practices:
- Uses constructor-based dependency injection  
- Properly scoped endpoint and HTTP verb  
- Uses `ResponseEntity` to manage HTTP response status  
- Clearly named method and variable (`getAllCustomers`)  
- Payload is directly used (`customers`), not a vague variable like `payload`  

---

## 🧹 Best Practices

- Annotate REST APIs with `@RestController` and map endpoints using `@RequestMapping` or HTTP-specific annotations (`@GetMapping`, etc.).
- Use DTOs to avoid exposing entities directly.
- Handle exceptions using `@ControllerAdvice`.
- Use `@Valid` and `@NotNull` for input validation.

---

## ✅ Testing Standards

- Write unit tests using JUnit and Mockito.
- Place tests in the `src/test/java` directory mirroring the main package.
- Use `@SpringBootTest` for integration testing.
- Cover service logic with unit tests, and controller logic with mock MVC tests.

---

## 🔒 Security Considerations

- Never hardcode passwords, tokens, or secrets.
- Externalize configuration using `application.properties` or `application.yml`.
- Use `@PreAuthorize` and `@Secured` where role-based access is required.

---

Happy Coding with GitHub Copilot in Spring Boot! 🚀