public class DateToDateTime {
    // Write a method to convert a LocalDate to LocalDateTime  [Ctrl +I]
       public static java.time.LocalDateTime convertToDateTime(java.time.LocalDate date) {
        return date.atStartOfDay();
    }

    public static void main(String[] args) {
        // Example usage
        java.time.LocalDate date = java.time.LocalDate.of(2025, 8, 15);
        java.time.LocalDateTime dateTime = convertToDateTime(date);
        
        System.out.println("Converted LocalDate to LocalDateTime: " + dateTime);
    }

}
