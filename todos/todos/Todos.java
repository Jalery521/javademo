package todos;

import java.util.Date;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import todo.Todo;

public class Todos {
  private String name;
  private ArrayList<Todo> todos = new ArrayList<Todo>();
  public Todos(){
     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
     Date date = new Date();
     this.name = dateFormat.format(date);
   }

  public ArrayList<Todo> getTodos(){
    return this.todos;
   }

   public void showTodos(){
      int size = this.todos.size();
      String message;
      if(size==0){
         message="暂未添加代办";
      }else {
      for(Todo item : this.todos){
        System.out.println(item);
        System.out.println("----------------------");
      }
      }
   }

  public void initTodo(){
    Scanner scanner = new Scanner(System.in);
    Boolean isContinue = false;
      do {
     System.out.print("请输入待办名称:");
     String name=scanner.nextLine();
     System.out.print("请输入待办内容:");
     String content=scanner.nextLine();
     System.out.print("请输入提醒时间");
     String time = scanner.nextLine();
     Todo todo = new Todo(name,content,time);
     this.todos.add(todo);
     System.out.println("是否继续添加代办,y/n");
     String isNextStr = scanner.nextLine();
     if(isNextStr.equals("y")){
       isContinue=true;
     }else if(isNextStr.equals("n")){
       isContinue=false;
     }else {
       System.out.println("请输入y/n");
     }
     }while (isContinue);
     this.showTodos();
  }
}
