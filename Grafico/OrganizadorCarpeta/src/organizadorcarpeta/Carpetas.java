package organizadorcarpeta;

import java.util.Arrays;

public class Carpetas {
    int carpeta[][];

    public Carpetas(int[][] carpeta) {
        this.carpeta = carpeta;
    }

    public int[][] getCarpeta() {
        return carpeta;
    }

    public void setCarpeta(int[][] carpeta) {
        this.carpeta = carpeta;
    }
    
    public boolean compara(int[][] carpetas) {
        
        for(int x=0;x<(MenuPrincipal.listaMaterias.size()/MenuPrincipal.materiasPorCarpeta)+1;x++){
            for(int y=0;y<MenuPrincipal.materiasPorCarpeta;y++){
                //System.out.print(carpeta[x][y]);
                if(carpeta[x][y] != carpetas[x][y])
                    return false;
            }
                System.out.println();
        }/*
        System.out.println("----- a -----");
        
        for(int x=0;x<(MenuPrincipal.listaMaterias.size()/MenuPrincipal.materiasPorCarpeta)+1;x++){
            for(int y=0;y<MenuPrincipal.materiasPorCarpeta;y++){
                System.out.print(carpetas[x][y]);
            }
                System.out.println();
        }
        System.out.println("-----");*/
        return true;
    }
    
    public int encontrarPosCarpeta(String materia){
        for(int i=0;i<carpeta.length;i++){
            for(int x=0;x<MenuPrincipal.materiasPorCarpeta;x++){
                if(carpeta[i][x]!=0 && MenuPrincipal.listaMaterias.get(carpeta[i][x]-1).equals(materia))
                    return i;
            }
        }
        return -1;
    }

}
