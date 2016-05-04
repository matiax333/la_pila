package clasepila;
import java.util.Stack;



public class Clasepila {

    
    public static void main(String[] args) {
        
       
        Stack lapila= new Stack();
        
        lapila.push("pes 2016");
        lapila.push("gta");
        lapila.push("max payne");
        lapila.push("dios de la guerra");
        
        System.out.println("pila :"+ lapila);
        System.out.println("tamaño de la pila :"+ lapila.size());
        System.out.println("la cima : "+ lapila.peek());
        System.out.println("buscar: "+ lapila.search("max payne"));
        System.out.println("quitar: "+ lapila.pop());
        System.out.println("¿la pila esta vacio? "+ lapila.empty());
        
        System.out.println("/////////////////////////////////////");
    
       
            
        Stack variable = new Stack();
        variable.push(8.0);
        variable.push(7.0);
        variable.push(6.0);
        variable.push(5.0);
        variable.push(4.0);
        for (int i = 0; i < variable.size(); i++) {
            System.out.println(variable.get(i));
        }
            
            
             System.out.println("/////////////////////////////////////");
             
             
        Stack vari = new Stack();
        vari.push(8.0);
        vari.push(7.0);
        vari.push(6.0);
        vari.push(5.0);
        vari.push(4.0);
        for (Object matias:vari) {
            System.out.println(matias);
        }
             System.out.println("/////////////////////////////////////");
             
            Stack ron = new Stack();
            
            ron.push("la vida es bella");
            ron.push("la vida es fea");
            ron.push("el secreto");
            ron.push("dr.house");
            while (!ron.empty()){
                System.out.println(ron.pop());
            }
            
            
            
            
        }
        }
