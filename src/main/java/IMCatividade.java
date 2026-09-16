import javax.swing.JOptionPane;
public class IMCatividade {

    public static void main(String[] args){
        String pesostr = JOptionPane.showInputDialog("Digite seu peso: ");
        double peso = Double.parseDouble(pesostr);
        String alturastr = JOptionPane.showInputDialog("Digite sua altura: ");
        double altura = Double.parseDouble(alturastr);
        double IMC = peso / (altura * altura);
        System.out.printf("Seu IMC é %.2f\n", IMC);
    }
}
