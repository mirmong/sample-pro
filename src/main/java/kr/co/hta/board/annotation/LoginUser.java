package kr.co.hta.board.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)	// 어느 시점에 이 어노테이션 해석을 할 것인가 지정
@Documented		// 주석 다는거와 연관
//@Target(ElementType.TYPE)
//@Target(ElementType.CONSTRUCTOR)
//@Target(ElementType.FIELD)
//@Target(ElementType.METHOD)

public @interface LoginUser {

}
