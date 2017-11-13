package CH7;

public class Test2 {
}

/*
A. If the equals() method returns true, the hashCode() comparison == might return false // Wrong, should be true (Its a contrat)
B. If the equals() method returns false, the hashCode() comparison == might return true // Correct, can be true or false
C. If the hashCode() comparison == returns true, the equals() method must return true // Wrong, could be true or false
D. If the hashCode() comparison == returns true, the equals() method might return true // Correct!
E. If the hashCode() comparison != returns true, the equals() method might return true // Wrong, should be false (Its a contrat)
 */