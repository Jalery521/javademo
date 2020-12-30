package todo;

/**
记录用户输入的代办标题，提醒时间和内容
 */
public class Todo {
 private String name;
 private String content;
 private String time;

 public Todo(String name,String content,String time){
    this.name = name;
    this.content = content;
    this.time = time;
  }

  // Override代表重写父类方法，编译时会验证父类是否有此方法
  @Override
  public String toString(){
   return this.name+"-"+this.time+":"+this.content;
  }
}
