#Sorting a List of Student by best grade 

## Method 1 :using Java 8 Comparator.Comparing with method references
## Preferred way
names.sort(
                Comparator.comparingDouble(Student::getAverage)
                .reversed()
                .thenComparing(Student::getName)
                .thenComparingInt(Student::getYear)
        );
        
## Method 2 : using type witness

names.sort(
                Comparator.<Student>comparingDouble(Student::getAverage)
                        .reversed()
                        .thenComparing(Student::getName)
                        .thenComparingInt(Student::getYear)
        );
## Method 3:  using Casting

        names.sort(
                Comparator.comparingDouble((Student s)->s.getAverage())
                .reversed()
                .thenComparing(s->s.getName())
                .thenComparing(s->s.getYear())
        );