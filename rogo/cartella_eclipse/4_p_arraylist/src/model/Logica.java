package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Logica {

	Scanner input; //= new Scanner(System.in);
	
	private int[] arr = {7,13,28,4,17};
	private List<Integer> arrList = new ArrayList<>();
	private Map<Integer,String> map = new HashMap<>();
	
    public void menu()
    {
        System.out.println("arr = 7,13,28,4,17");
        System.out.println("1-trova il max e il minimo");
        System.out.println("restituisci la media aritmetica");
        System.out.println("quanti sono i numeri dispari");
        System.out.println("restituire la somma dei numeri pari");
        
        //arrList.removeAll(Collections.singleton(3));
        //map.replaceAll( );
        
    }

    public int max(int[] arr)
    {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) 
			max = (arr[i] > max) ? arr[i] : max;  
		
        return max;
    }

    public int min(int[] arr)
    {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) 
			min = (arr[i] < min) ? arr[i] : min;  
		
        return min;
    }
    
    public float mediaAritmetica(int [] arr)
    {
    	int media = 0;
    	for (int i = 0; i < arr.length; i++) {
			media += arr[i];
		}
    	
    	return media/=arr.length;
    	
    }

    public int numeroDispari(int[] arr)
    {
    	int nDispari = 0;
    	
    	for (int i = 0; i < arr.length; i++)     		
    		nDispari += (arr[i]%2==1) ? 1 : 0; 

		return nDispari;
    }

    public int sommaPari(int [] arr)
    {
    	int somma = 0;
    	
    	for (int i : arr) 
    		somma += (i%2 == 0)? i : 0;
		
    	return somma;
    }

    
}
