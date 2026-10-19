public class App {
    public static void main(String[] args) throws Exception {
        BinarySearchTree<Integer> arvore = new BinarySearchTree<>();

        Integer[] valores = {50, 30, 70, 20, 40, 60, 80};

        for (Integer valor : valores) {
            arvore.add(valor);
        }

        System.out.println("Percurso preOrder:");
        arvore.preOrder();
    }
}
