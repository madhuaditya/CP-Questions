import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   String str  = sc.next();
   char c = str.charAt(0);
   if( (int) c> 96&& (int) c<123){
        char ch = (char) (c-32);
       str =   str.replaceFirst( ""+ c,""+ ch);
       System.out.println(str);
        return;
   }
//        System.out.println((char) ('a'-32));
        System.out.println(str);
//     StringBuilder sb = new StringBuilder("");
//     for (int i =0; i< str.length(); i++){
//         if(str.charAt(i)=='x'){
//             sb.append('x');
//         }
//         else {
//             sb.append(str.charAt(i));
//         }
//     }
//        System.out.println(sb.toString());
//     String a = "XYaPXPXHXGePfGtQySlNrLXSjDtNnTaRaEpAhPaQpWnDzMqGgRgEwJXGiBdZnMtHXFbObCaGiCeZkUqIgBhHtNvAqAlHpMnQhNeQbMyZrCdElVwHtKrPpJjIaHuIlYwHaRkAkUpPlOhNlBtXwDsKzPyHrPiUwNlXtTaPuMwTqYtJySgFoXvLiHbQwMjSvXsQfKhVlOXGdQkWjBhEyQvBjPoFkThNeRhTuIzFjInJtEfPjOlOsJpJuLgLzFnZmKvFgFrNsOnVqFcNiMfCqTpKnVyLwNqFiTySpWeTdFnWuTwDkRjVXNyQvTrOoEiEXYiFaIrLoFmJfZcDkHuWjYfCeEqCvEsZiWnJaEmFbMjDvYwEeJeGcKbVbChGsIzNlEXHzHiTlHcSaKXLuZXX";
//     String b = ""
    }
}
