package br.com.bootcampdio.frameworks.collections.set.exemplo;

import java.util.Comparator;

public class Series implements Comparable<Series> {
  String nome;
  String genero;
  int tempoEpisodio;

  public Series(String nome, String genero, int tempoEpisodio) {
    this.nome = nome;
    this.genero = genero;
    this.tempoEpisodio = tempoEpisodio;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getGenero() {
    return genero;
  }
  public void setGenero(String genero) {
    this.genero = genero;
  }
  public int getTempoEpisodio() {
    return tempoEpisodio;
  }
  public void setTempoEpisodio(int tempoEpisodio) {
    this.tempoEpisodio = tempoEpisodio;
  }
  @Override
  public String toString() {
    return "[nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
  }
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((genero == null) ? 0 : genero.hashCode());
    result = prime * result + tempoEpisodio;
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Series other = (Series) obj;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (genero == null) {
      if (other.genero != null)
        return false;
    } else if (!genero.equals(other.genero))
      return false;
    if (tempoEpisodio != other.tempoEpisodio)
      return false;
    return true;
  }
  @Override
    public int compareTo(Series serie) {
            int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
            if (tempoEpisodio != 0) return tempoEpisodio;

            return this.getGenero().compareTo(serie.getGenero());
    }

}

 


  
  


