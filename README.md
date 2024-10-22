# Caesar Encryption Decryption in Java

## Project overview
This project is part of a maths project discussing the **Caesar ciphering**. Caesar ciphering is a simple method of substitution ciphering in which each letter of a text is replaced by another letter that is a fixed number of positions further on in the alphabet.

### Encryption
Encryption is performed according to the formula
\[y = (x + e) \mod 26\]
Where:
- \( x \) is the numerical value of the letter in the alphabet (A = 0, B = 1, ..., Z = 25),
- \( e \) the encryption key (a positive Integer),
- \( y \) the encrypted letter.

### Decryption
The reverse formula is used for decryption:
\[x = (y - e + 26) \mod 26\]
This converts the encrypted text back into plain text.

### Operating instructions
(1): Nachricht verschlüsseln
(2): Nachricht entschlüsseln

### Example
(1): Nachricht verschlüsseln
(2): Nachricht entschlüsseln
1
Bitte Nachricht eingeben: Hello World
Bitte Schlüssel eingeben: 5
Mjqqt Btwqi!
