package kfq.cookcrew.reciepe;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

/**
 * *****************************************************<p>
 * recipe 테이블<p>
 * 프로그램 설명 : 전체레시피, 인기레시피 <p>
 * 담당 : 조현빈, 유재혁, 이규희 <p>
 * *****************************************************
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "dbRecipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rNo; // 레시피 번호
    @Column
    private String regId; // 작성자 아이디
    @Column
    private String title; //레시피 제목
    @Column
    private String content; //레시피 내용
    @Column
    private Integer cnt; // 조회수
    @Column
    private Character enabled; // 삭제여부
    @Column
    private LocalDate regDate; // 등록일자
    @Column
    private Date modDate; // 수정일자
    @Column
    private Float rKcal; //칼로리
    @Column
    private String thumbPath; //썸네일경로

}

    //Database Table 생성 쿼리문

    /*create table dbRecipe (
            r_no int primary key auto_increment,
            reg_id varchar(45) not null,
    title varchar(45) not null,
    content longtext not null,
    cnt int default 0,
    reg_date date,
    mod_date date,
    ednabled char default 'y',
    r_kcal float default 0,
    thumb_path text(1000) default null
            );*/

