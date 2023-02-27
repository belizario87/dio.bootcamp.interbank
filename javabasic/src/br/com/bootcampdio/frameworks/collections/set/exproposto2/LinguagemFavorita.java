package br.com.bootcampdio.frameworks.collections.set.exproposto2;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
String nome;
int anoDeCriacao;
String ide;

public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
  this.nome = nome;
  this.anoDeCriacao = anoDeCriacao;
  this.ide = ide;
}

public String getNome() {
  return nome;
}

public void setNome(String nome) {
  this.nome = nome;
}

public int getAnoDeCriacao() {
  return anoDeCriacao;
}

public void setAnoDeCriacao(int anoDeCriacao) {
  this.anoDeCriacao = anoDeCriacao;
}

public String getIde() {
  return ide;
}

public void setIde(String ide) {
  this.ide = ide;
}

@Override
public int hashCode() {
  final int prime = 31;
  int result = 1;
  result = prime * result + ((nome == null) ? 0 : nome.hashCode());
  result = prime * result + anoDeCriacao;
  result = prime * result + ((ide == null) ? 0 : ide.hashCode());
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
  LinguagemFavorita other = (LinguagemFavorita) obj;
  if (nome == null) {
    if (other.nome != null)
      return false;
  } else if (!nome.equals(other.nome))
    return false;
  if (anoDeCriacao != other.anoDeCriacao)
    return false;
  if (ide == null) {
    if (other.ide != null)
      return false;
  } else if (!ide.equals(other.ide))
    return false;
  return true;
}

@Override
public String toString() {
  return "{[nome=" + nome + ", anoDeCriacao=" + anoDeCriacao + ", ide=" + ide + "]}";
}

@Override
public int compareTo(LinguagemFavorita n1) {
    return 0;
}





  
}
