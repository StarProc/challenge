package com.sckim.starproc.study;

import lombok.EqualsAndHashCode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;

import java.util.*;

/**
 * 라이브러리 학습코드
 *
 * 자료구조, jdk
 * 스택, 큐, 연결리스트, 트리
 * list, map, array, collection
 *
 * 0. java-doc
 *
 * 1. List, Map, Set - 생성, 삽입, 삭제, 복사
 *  - 생성 후 5개 숫자 요소 =>
 *
 * 2. 컬렉션 to 배열
 *
 * 3. thread safe 컬렉션
 *
 * 4. 큐 사용
 *
 * 5. 불변 객체
 */
public class CollectionStudyTest {

    @EqualsAndHashCode
    public static class Person implements Cloneable {
        String name;
        int id;

        public Person(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
//            return super.clone();
            return new Person(this.name, this.id);
        }

        @Override
        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            Person person = (Person) o;
//            return id == person.id && Objects.equals(name, person.name);
            return true;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, id);
        }
    }

//    @Test(expected=Exception.class)
    public void test01() {
//        System.out.println("end");
//      List list = new ArrayList<>();        for(int i=0; i<list.size(); i++) {
//            list.get(0);
////            Collections.copy();
//        }
//
//        handleListSomeTask(null);
//        handleListSomeTask(Arrays.asList(new String[]{}));
//        handleListSomeTask(Arrays.asList(new String[]{"1","1"}));
//        handleListSomeTask(Arrays.asList(new String[]{"1","1","1"}));
//
//        new ArrayList<>().stream().forEach(el -> {
//            System.out.println(el);
//        });

        List list2 = Arrays.asList(new Person[] {
            new Person("a",2),
            new Person("a",2),
            new Person("c",3)
        });



        List list3 = new ArrayList(list2);
        ((Person) list3.get(2)).setId(20);

        System.out.println(list2.get(2));
        System.out.println(list3.get(2));

//        BeanUtils.copyProperties();

        HashSet<Person> set1 = new HashSet<>(list2);
        set1.add(new Person("x",10));

        set1.contains(new Person("a",2));



    }

    /**
     * 리스트를 받아서 가운데 홀수 번째 요소만 리턴, 널요소는 제외
     */
    private List handleListSomeTask(List src) {

        List dst = null;

        // 전처리 - pre process, 파라미터 검증
        // 리스트 개수가 홀수개인지 짝수개인지 확인

        // 로직 1
        // 찾아야 하는 요소의 인덱스 저장
        // 널요소 제외 -> 홀수 요소 리턴

        // 로직 2
        // 그 인덱스에 해당하는 요소만 추출 후 리턴

        // 로직 process

        // 리턴을 위한 마무리 - post process
     return dst;
    }
}
