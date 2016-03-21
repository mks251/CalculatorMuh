package ru.calculator.muh;


import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;
import javax.swing.JButton;
public class CalculatorEngine/*вычислительная машина*/ implements ActionListener/*действие слушателя*/ {
Calculator parent/*предок*/;  //ссылка на окно калькулятора
char selectedAction/*выбранное действие*/ = ' ';  // +, -, /, или*
double currentResult/*текущий результат*/ =0;     
// Конструктор сохраняет ссылку на окно калькулятора
// в переменной экземпляра класса
CalculatorEngine(Calculator parent){
this.parent = parent;
}
public void actionPerformed/*совершаемое действие*/(ActionEvent/*действие события*/ e){ 
// Получить источник действия
JButton clickedButton/*нажал кнопку*/ =  (JButton) e.getSource/*получить источник*/();
String dispFieldText/*индикатор текстовое поле*/=parent.displayField.getText/*родителем. Поле отображения. получить текст*/();
double displayValue/*Значение дисплея*/=0;
// Получить число из дисплея калькулятора,
// если он не пустой. 
// Восклицательный знак – это оператор отрицания
if (!"".equals/*равняется*/(dispFieldText)){
displayValue= Double.parseDouble/*синтаксический анализ */(dispFieldText);  
}
Object src = e.getSource();
// Для каждой кнопки арифметического действия
// запомнить его: +, -, /, или*, сохранить текущее число
// в переменной currentResult, и очистить дисплей
// для ввода нового числа
if (src == parent.buttonPlus){
selectedAction = '+';
currentResult=displayValue;
parent.displayField.setText("");
} else if (src == parent.buttonMinus){
selectedAction = '-';
currentResult=displayValue;
parent.displayField.setText("");
}else if (src == parent.buttonDivide){
selectedAction = '/';
currentResult=displayValue;
parent.displayField.setText("");
} else if (src == parent.buttonMultiply){
selectedAction = '*';
currentResult=displayValue;
parent.displayField.setText("");
} else if (src == parent.buttonEqual){
//selectedAction = '=';
//currentResult=displayValue;
//parent.displayField.setText("");
//} else if (src == parent.buttonPercent){
//selectedAction = '%';
//currentResult=displayValue;
//parent.displayField.setText("");
//} else if (src == parent.buttonCleanOut){
//selectedAction = 'с';
//currentResult=displayValue;
//parent.displayField.setText("");
// Совершить арифметическое действие, в зависимости
// от selectedAction, обновить переменную currentResult
// и показать результат на дисплее

if (selectedAction/*выбрал вариант*/=='+'){
currentResult/*Текущий результат*/ +=displayValue/*значение дисплея*/;
// Сконвертировать результат в строку, добавляя его
// к пустой строке и показать его
parent.displayField.setText(""+currentResult);
}else if (selectedAction=='-'){
currentResult -=displayValue;
parent.displayField.setText(""+currentResult);
}else if (selectedAction=='/'){
currentResult /=displayValue; 
parent.displayField.setText(""+currentResult);
}else if (selectedAction=='*'){ 
currentResult *=displayValue;
parent.displayField.setText(""+currentResult);
//}else if (selectedAction=='='){ 
//currentResult =displayValue;
//parent.displayField.setText(""+currentResult);
//}else if (selectedAction=='%'){ 
//currentResult %=displayValue;
//parent.displayField.setText(""+currentResult);
}
}else if (src == parent.buttonCleanOut){
selectedAction = 'с';
currentResult =displayValue;
parent.displayField.setText("");
} else{
// Для всех цифровых кнопок присоединить надпись на
// кнопке к надписи в дисплее
String clickedButtonLabel= clickedButton.getText();
parent.displayField.setText(dispFieldText +clickedButtonLabel);
}}}
