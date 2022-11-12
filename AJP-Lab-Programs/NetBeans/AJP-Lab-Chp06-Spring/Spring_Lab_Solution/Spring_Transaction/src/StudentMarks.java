/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*


CREATE  TABLE `sampledb`.`student` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `sname` VARCHAR(45) NULL ,
    `age` INT NULL,
      PRIMARY KEY (`id`) );

CREATE  TABLE `sampledb`.`Marks` (
`sid` INT,
`marks` INT NULL,
`year` INT NULL);
*/
/**
 *
 * @author admin
 */
public class StudentMarks {
    
   private Integer age;
   private String name;
   private Integer id;
   private Integer marks;
   private Integer year;
   private Integer sid;

   public void setAge(Integer age) {
      this.age = age;
   }
   public Integer getAge() {
      return age;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getName() {
      return name;
   }
   public void setId(Integer id) {
      this.id = id;
   }
   public Integer getId() {
      return id;
   }
   public void setMarks(Integer marks) {
      this.marks = marks;
   }
   public Integer getMarks() {
      return marks;
   }
   public void setYear(Integer year) {
      this.year = year;
   }
   public Integer getYear() {
      return year;
   }
   public void setSid(Integer sid) {
      this.sid = sid;
   }
   public Integer getSid() {
      return sid;
   }
}
   
