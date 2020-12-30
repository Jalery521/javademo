import todos.Todos;

/**
每日代办事宜记录和提醒功能
 */
public class App {
 public static final String name="App";
 public static void main(String[] args){
   Todos todos = new Todos();
   todos.initTodo();
 }
}
