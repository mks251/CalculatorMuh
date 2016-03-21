package ru.calculator.muh;
/*Класс!Calculator!делает!следующие!действия:!
!
"  Создает!и!показывает!все!компоненты!окна.!
"  Создает!экземпляр!слушателя!CalculatorEngine.!!
"  Передает!CalculatorEngine!ссылку!на!себя.!
"  Регистрирует!этого!слушателя!во!всех!компонентах,!
которые!создают!события.!
!
Вот!последняя!версия!класса!Calculator:!*/
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
public class Calculator {
// Объявляем и инициализируем компоненты окна
JButton button0=new JButton("0");
JButton button1=new JButton("1");
JButton button2=new JButton("2"); 
JButton button3=new JButton("3");
JButton button4=new JButton("4");
JButton button5=new JButton("5");
JButton button6=new JButton("6");
JButton button7=new JButton("7");
JButton button8=new JButton("8");
JButton button9=new JButton("9");
JButton buttonPoint = new JButton(".");
JButton buttonEqual=new JButton("=");
JButton buttonPlus=new JButton("+");
JButton buttonMinus=new JButton("-");
JButton buttonDivide=new JButton("/");
JButton buttonMultiply=new JButton("*");
//JButton buttonPercent=new JButton("%");
JButton buttonCleanOut=new JButton("C");
JPanel windowContent/*содержимое окна*/ = new JPanel();
JTextField displayField/*поле отображения*/ = new JTextField(16);
// Конструктор
Calculator(){
// Установить менеджер расположения для панели
BorderLayout/*бордюр раскладки*/ bl = new BorderLayout();
windowContent.setLayout/*установить набор планировки*/(bl);
displayField.setFont/*установить набор шрифтов*/(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
displayField.setForeground/*установить передний план*/(Color.RED);
// Добавляем дисплей в верхней части окна
windowContent.add("North",displayField);
// Создаем панель с менеджером расположения GridLayout
// в которой будет13 кнопок - 10 цифр, и
// кнопки“точка” и“равно” 
JPanel p1 = new JPanel();
GridLayout/*Макет сетки*/ gl =new GridLayout(4,3);
p1.setLayout/*набранная планировка*/(gl);
button1.setForeground/*Передний план установлен*/(Color.BLACK);
p1.add(button1);
p1.add(button2);
p1.add(button3);
p1.add(button4);
p1.add(button5);
p1.add(button6);
p1.add(button7);
p1.add(button8);
p1.add(button9);
p1.add(button0);
p1.add(buttonPoint);
p1.add(buttonEqual);
// Добавляем панель p1 в центр окна
windowContent.add("Center",p1); 
// Создаем панель с менеджером расположения GridLayout
// на которой будет5 кнопок -// Плюс, Минус, Разделить, Умножить и очистить
JPanel p2 = new JPanel();
GridLayout gl2 =new GridLayout(6,1);
p2.setLayout(gl2);
p2.add(buttonPlus);
p2.add(buttonMinus);
p2.add(buttonMultiply);
p2.add(buttonDivide);
p2.add(buttonCleanOut);
//p2.add(buttonPercent);
//Добавляем панель p2 в правую часть окна
windowContent.add("East",p2);
// Создаем frame и добавляем в него содержимое    JFrame
JFrame frmPriroda = new JFrame("PRIRODA");
frmPriroda.setTitle/*установить заглавие*/("priroda");
frmPriroda.setContentPane/*установить набор панели контента*/(windowContent);
// Устанавливаем размер окна, так чтобы уместились
// все компоненты
frmPriroda.pack();
// Показываем окно
frmPriroda.setVisible(true);
// Создаем экземпляр слушателя событий и
// регистрируем его в каждой кнопке
CalculatorEngine calcEngine = new CalculatorEngine(this);
button0.addActionListener(calcEngine);
button1.addActionListener(calcEngine);
button2.addActionListener(calcEngine);
button3.addActionListener(calcEngine);
button4.addActionListener(calcEngine);
button5.addActionListener(calcEngine);
button6.addActionListener(calcEngine);
button7.addActionListener(calcEngine);
button8.addActionListener(calcEngine);
button9.addActionListener(calcEngine);
buttonPoint.addActionListener(calcEngine);
buttonPlus.addActionListener(calcEngine);
buttonMinus.addActionListener(calcEngine);
buttonDivide.addActionListener(calcEngine);
buttonMultiply.addActionListener(calcEngine);
buttonEqual.addActionListener(calcEngine);
//buttonPercent.addActionListener(calcEngine);
buttonCleanOut.addActionListener(calcEngine);
}
public static void main(String[] args) {
// Создаем экземпляр класса“Калькулятор”
@SuppressWarnings("unused")
Calculator calc = new Calculator();

}
} 
/*Теперь!скомпилируем!проект!и!запустим!класс!Calculator.!Она!работает!
почти! так! же,! как! и! настоящие! калькуляторы.! Поздравляю!! Это! ваша!
первая! программа,! которая! может! пригодиться! многим! людям!–!!
подарите!ее!своим!друзьям.!*/
