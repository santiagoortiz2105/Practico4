package model;

public class Materia {
    private int idMateria;
    private String nombreMateria;
    private int anioCurso;

    public Materia(int idMateria, String nombreMateria, int anioCurso) {
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.anioCurso = anioCurso;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getAnioCurso() {
        return anioCurso;
    }

    public void setAnioCurso(int anioCurso) {
        this.anioCurso = anioCurso;
    }
    
    
}
