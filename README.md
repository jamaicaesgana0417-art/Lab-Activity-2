Name: Jamaica O. Esgana 
Section: 2A 
Activity: Lab_4_ Encapsulation IT-OOPROG21

Encapsulation
The Vehicle class was refactored using encapsulation by making the fields brand, model, and year private. Public getters were added, while the year can only be changed through the setYear() method with valid year values from 1886 to 2026.

Required Tests
- setYear(2000) returns true
- Year becomes 2000
- Age becomes 26
- Vehicle is vintage: true
- setYear(1885) returns false and year remains 2000
- setYear(2027) returns false and year remains 2000
- Constructor with 1885 stores 2026
- Constructor with 2027 stores 2026

Expected Console Output

=== SET YEAR TESTS ===

setYear(2000): true

Year: 2000

Car's Age: 26

Is this vehicle considered vintage? true

setYear(1885): false

Year remains: 2000

setYear(2027): false

Year remains: 2000

=== CONSTRUCTOR VALIDATION TESTS ===

Constructor with 1885 -> Year: 2026
 
Constructor with 2027 -> Year: 2026
