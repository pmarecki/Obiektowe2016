package hallo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created on 08.10.16, at 08:52
 */

@Data
@AllArgsConstructor
public class Book {
    String autor;
    String tytul;
    Integer cena;
    String adres;
}
