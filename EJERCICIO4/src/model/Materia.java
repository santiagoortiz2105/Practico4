package model;

import java.util.Objects;

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
    
    @Override
    public String toString() {
        return nombreMateria + " (" + anioCurso + "° año)";
    }
    
   @Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if (!(obj instanceof Materia)) {
        return false;
    }
    Materia other = (Materia) obj;
    return this.idMateria == other.idMateria;
}

@Override
public int hashCode() {
  int hash = 7;
    hash = 31 * hash + this.idMateria;
    return hash;  
}
    
}
