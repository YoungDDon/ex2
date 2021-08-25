package org.zerock.ex2.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_memo")
@ToString
@Getter
@Builder
@AllArgsConstructor // 모든 매개변수를 포함
@NoArgsConstructor // 매개변수 없이 생성자
public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;

    @Column(length = 200, nullable = false)
    private String memoText;
}
