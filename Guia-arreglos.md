# 1 ¿Cómo se declara un arreglo en Java?

## Manera 1: Inicialización directa con valores

``` java
int[] numbers = {67, 76, 45, 34, 98};

System.out.println("Manera numero 1: " + numbers[0]);
```

## Manera 2: Tamaño fijo y asignación manual por índice

``` java
int[] numbers = new int[6];

numbers[0] = 25;
numbers[1] = 45;
numbers[2] = 34;
numbers[3] = 5;
numbers[4] = 4;
numbers[5] = 46;

System.out.println("Manera numero 2: " + numbers[5]);
```

------------------------------------------------------------------------

# 2 Métodos y utilidades principales para arreglos

``` java
import java.util.Arrays;
```

## 1) Arrays.toString()
Imprime directamente el arreglo, sin usar un FOR.

``` java
int[] a = {10,20,30,40,50};

System.out.println(Arrays.toString(a));
```

## 2) Arrays.sort()
Imprime el arreglo completo, de menor a mayor.

``` java
int[] b = {5,2,4,3,1};

Arrays.sort(b);
System.out.println(Arrays.toString(b));
```

## 3) Arrays.equals()
Se comparar 2 arreglos.

``` java
int[] c = {1,2,3,4,5};

System.out.println(Arrays.equals(b, c));
```

## 4) Arrays.binarySearch()
Se busca la posicion de un numero dentro de un arreglo en orden

``` java
int position = Arrays.binarySearch(c, 4);
System.out.println("Posicion: " + position);
```

## 5) Arrays.stream()
Procesa arreglos de manera funcional sin tantos enredos

``` java
int suma = Arrays.stream(a).sum();
System.out.println("Suma: " + suma);
```

------------------------------------------------------------------------

# 4.3 ¿Cómo se recorren los arreglos en Java?

## 1) For tradicional

``` java
int[] num = {5, 10, 15, 20, 25, 30};

for(int i = 0; i < num.length; i++) {
    System.out.println("FOR TRADICIONAL: " + num[i]);
}
```

## 2) For-each

``` java
for (int n : num) {
    System.out.println("FOR-EACH: " + n);
}
```

## 3) Streams

``` java
Arrays.stream(num)
      .forEach(n -> System.out.println("STREAM: " + n));
```

------------------------------------------------------------------------

# 4.4 Diferencias entre arreglos y ArrayList en Java

## Tamaño fijo (Array)

``` java
int[] numbers = new int[2];
numbers[0] = 1;
numbers[1] = 4;

System.out.println(numbers[1]);
```

## Tamaño dinámico (ArrayList)

``` java
ArrayList<Integer> lista = new ArrayList<>();
lista.add(10);
lista.add(20);
lista.add(30);

System.out.println(lista.get(2));
System.out.println(lista.size());
```

## Métodos disponibles

### Array

``` java
int[] numbers = new int[4];

System.out.println(numbers.length);
System.out.println(numbers[2]);
```

### ArrayList

``` java
ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);

System.out.println(list.get(2));
System.out.println(list.size());
System.out.println(list.add(10));
```

## Tipos primitivos vs clases envolventes

### Array

``` java
int[] numeros = {1,2,3};
```

### ArrayList

``` java
ArrayList<Integer> lista = new ArrayList<>();
```

## Rendimiento

-   ARRAY: Más rápido y eficiente en memoria.
-   ARRAYLIST: Más flexible pero consume más memoria.

## ¿Cuándo usar cada uno?

-   ARRAY: Cuando el tamaño no cambia y se necesita máximo rendimiento.
-   ARRAYLIST: Cuando el tamaño puede variar y se quiere mayor
    flexibilidad.
