package pl.urbanik.interfaces;

import java.util.List;
import java.util.Optional;

public interface Structure {

    // zwraca dowolny element o podanym kolorze
    Optional findBlockByColor(String color);

    // zwraca wszystkie elementy z danego materiału
    List findBlocksByMaterial(String material);

    //zwraca liczbę wszystkich elementów tworzących strukturę
    int count();

    void addBlock(Block block);
}
