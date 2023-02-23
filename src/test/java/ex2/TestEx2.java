package ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TestEx2 {

    @Test
    void count() {
    }

    @Test
    void size() {
    }

    @Test
    void prueba1() {
        String key = "1" ;
        String value = "p1";
        HashTable ht = new HashTable();
        ht.put(key,value);
        Assertions.assertEquals("\n" +
                " bucket[1] = [1, p1]", ht.toString());
    }

    @Test
    void prueba2(){
        String key = "1" ;
        String value = "p1";
        String key2 = "2";
        String value2 = "p2";
        HashTable ht = new HashTable();
        ht.put(key, value);
        ht.put(key2, value2);
        Assertions.assertEquals("\n" +
                " bucket[1] = [1, p1]" + "\n" + " bucket[2] = [2, p2]", ht.toString());
    }

    @Test
    void prueba3(){
        String key = "1" ;
        String value = "p1";
        String key2 = "2";
        String value2 = "p2";
        HashTable ht = new HashTable();
        ht.put(key, value);
        ht.put(key2, value2);

        String key13 = "13" ;
        String value13 = "p13";
        ht.put(key13, value13);
        Assertions.assertEquals("\n" +
                " bucket[1] = [1, p1]"+ "\n" +" bucket[2] = [2, p2] -> [13, p13]", ht.toString());
    }

    @Test
    void prueba4(){
        String key = "1" ;
        String value = "p1";
        String key2 = "2";
        String value2 = "p2";
        HashTable ht = new HashTable();
        ht.put(key, value);
        ht.put(key2, value2);

        String key11 = "13" ;
        String value11 = "p13";
        ht.put(key11, value11);

        ht.put("24","p24");
        Assertions.assertEquals("\n" +
                " bucket[1] = [1, p1]"+ "\n" +" bucket[2] = [2, p2] -> [13, p13] -> [24, p24]", ht.toString());
    }

    @Test
    void prueba5(){
        //Tabla llena de elementos, prueba para hacer un update al value del bucket[1] cambiando el value por "p1.1"
        //Da error ya que en el codigo no hay nada hecho para que cuando intentes hacer un put en un elemento que ya tiene value
        String key = "1" ;
        String value = "p1";
        String key2 = "2";
        String value2 = "p2";
        String key13 = "13";
        String value13 = "p13";
        String key24 = "24";
        String value24 = "p24";
        String keyupdate1 = "1";
        String valueupdate1 = "p1.1";

        HashTable ht = new HashTable();
        ht.put(key, value);
        ht.put(key2, value2);
        ht.put(key13, value13);
        ht.put(key24,value24);
        ht.put(keyupdate1, valueupdate1);
        System.out.println(ht);

        Assertions.assertEquals("\n" +
                " bucket[1] = [1, p1.1]"+ "\n" +" bucket[2] = [2, p2] -> [13, p13] -> [24, p24]", ht.toString());
    }

    @Test
    void prueba6(){
        String key = "1" ;
        String value = "p1";
        String key2 = "2";
        String value2 = "p2";
        String key13 = "13";
        String value13 = "p13";
        String key24 = "24";
        String value24 = "p24";
        String keyupdate1 = "1";
        String valueupdate1 = "p1.1";

        HashTable ht = new HashTable();
        ht.put(key, value);
        ht.put(key2, value2);
        ht.put(key13, value13);
        ht.put(key24,value24);
        ht.put(keyupdate1, valueupdate1);

        Assertions.assertEquals("\n" +
                " bucket[1] = [1, p1.1]"+ "\n" +" bucket[2] = [2, p2] -> [13, p13] -> [24, p24]", ht.toString());
    }





    @Test
    void get() {
    }

    @Test
    void drop() {
    }
}