package organizadorcarpeta;

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
    
    public int encontrarPosCarpeta(String materia){
        for(int i=0;i<carpeta.length;i++){
            for(int x=0;x<MenuPrincipal.materiasPorCarpeta;x++){
                if(MenuPrincipal.listaMaterias.get(carpeta[i][x]-1).equals(materia))
                    return i;
            }
        }
        return -1;
    }
}
