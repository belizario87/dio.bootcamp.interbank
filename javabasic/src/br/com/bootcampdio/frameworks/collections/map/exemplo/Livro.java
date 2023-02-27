package br.com.bootcampdio.frameworks.collections.map.exemplo;

public class Livro {
  //Atributes
  private int paginas;
  private String nomeLivro;
  
  
  //Constructor
  public Livro(Integer paginas, String nomeLivro) {
    this.paginas = paginas;
    this.nomeLivro = nomeLivro;
  }

  
   //Geters and seters
  public Integer getAutor() {
    return paginas;
  }

  public void setAutor(Integer paginas) {
    this.paginas = paginas;
  }

  public String getNomeLivro() {
    return nomeLivro;
  }

  public void setNomeLivro(String nomeLivro) {
    this.nomeLivro = nomeLivro;
  }
  //To String
  @Override
  public String toString() {
    return "[paginas=" + paginas + ", nomeLivro=" + nomeLivro + "]";
  }


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + paginas;
    result = prime * result + ((nomeLivro == null) ? 0 : nomeLivro.hashCode());
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
    Livro other = (Livro) obj;
    if (paginas != other.paginas)
      return false;
    if (nomeLivro == null) {
      if (other.nomeLivro != null)
        return false;
    } else if (!nomeLivro.equals(other.nomeLivro))
      return false;
    return true;
  }


  
  
  
 
  


  

}
