package br.com.bootcampdio.frameworks.collections.map.exproposto3;


/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;

*/


import java.util.*;


public class ExProposto3 {

    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contato> agenda = new HashMap<>() {{

            put(1, new Contato("Simba", 2222));
            put(4, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));


        }};

        System.out.println(agenda);

        for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {

            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());


        }


        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
            put(1, new Contato("Cami", 5555));
            put(4, new Contato("Simba", 5555));
            put(3, new Contato("Jon", 5555));

        }};



        for (Map.Entry<Integer, Contato> entry : agenda1.entrySet()) {

            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);



        for (Map.Entry<Integer, Contato> entry : agenda2.entrySet()) {

            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem número telefone\t--");
        //precisamos organizar os valores, logo:

//        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
//                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
//            }
//        });
       Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(ExProposto3::apply2));
        set.addAll(agenda.entrySet());

        for (Map.Entry<Integer, Contato> entry : set) {

            System.out.println(entry.getValue().getNumero() + " - " + entry.getValue().getNome());
        }



        System.out.println("--\tOrdem nome contato\t--");
        //precisamos organizar valores, logo
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(ExProposto3::apply));

        set1.addAll(agenda.entrySet());

        for(Map.Entry<Integer, Contato> entry : set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());

        }





    }


    private static String apply(Map.Entry<Integer, Contato> Contato) {
        return Contato.getValue().getNome();
    }

    private static Integer apply2(Map.Entry<Integer, Contato> Contato) {
        return Contato.getValue().getNumero();
    }
}
