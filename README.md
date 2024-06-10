# 키친포스

## 퀵 스타트

```sh
cd docker
docker compose -p kitchenpos up -d
```

## 요구 사항

### 상품

- 상품을 등록할 수 있다.
- 상품의 가격이 올바르지 않으면 등록할 수 없다.
  - 상품의 가격은 0원 이상이어야 한다.
- 상품의 이름이 올바르지 않으면 등록할 수 없다.
  - 상품의 이름에는 비속어가 포함될 수 없다.
- 상품의 가격을 변경할 수 있다.
- 상품의 가격이 올바르지 않으면 변경할 수 없다.
  - 상품의 가격은 0원 이상이어야 한다.
- 상품의 가격이 변경될 때 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 크면 메뉴가 숨겨진다.
- 상품의 목록을 조회할 수 있다.

### 메뉴 그룹

- 메뉴 그룹을 등록할 수 있다.
- 메뉴 그룹의 이름이 올바르지 않으면 등록할 수 없다.
  - 메뉴 그룹의 이름은 비워 둘 수 없다.
- 메뉴 그룹의 목록을 조회할 수 있다.

### 메뉴

- 1 개 이상의 등록된 상품으로 메뉴를 등록할 수 있다.
- 상품이 없으면 등록할 수 없다.
- 메뉴에 속한 상품의 수량은 0 이상이어야 한다.
- 메뉴의 가격이 올바르지 않으면 등록할 수 없다.
  - 메뉴의 가격은 0원 이상이어야 한다.
- 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
- 메뉴는 특정 메뉴 그룹에 속해야 한다.
- 메뉴의 이름이 올바르지 않으면 등록할 수 없다.
  - 메뉴의 이름에는 비속어가 포함될 수 없다.
- 메뉴의 가격을 변경할 수 있다.
- 메뉴의 가격이 올바르지 않으면 변경할 수 없다.
  - 메뉴의 가격은 0원 이상이어야 한다.
- 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
- 메뉴를 노출할 수 있다.
- 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 높을 경우 메뉴를 노출할 수 없다.
- 메뉴를 숨길 수 있다.
- 메뉴의 목록을 조회할 수 있다.

### 주문 테이블

- 주문 테이블을 등록할 수 있다.
- 주문 테이블의 이름이 올바르지 않으면 등록할 수 없다.
  - 주문 테이블의 이름은 비워 둘 수 없다.
- 빈 테이블을 해지할 수 있다.
- 빈 테이블로 설정할 수 있다.
- 완료되지 않은 주문이 있는 주문 테이블은 빈 테이블로 설정할 수 없다.
- 방문한 손님 수를 변경할 수 있다.
- 방문한 손님 수가 올바르지 않으면 변경할 수 없다.
  - 방문한 손님 수는 0 이상이어야 한다.
- 빈 테이블은 방문한 손님 수를 변경할 수 없다.
- 주문 테이블의 목록을 조회할 수 있다.

### 주문

- 1개 이상의 등록된 메뉴로 배달 주문을 등록할 수 있다.
- 1개 이상의 등록된 메뉴로 포장 주문을 등록할 수 있다.
- 1개 이상의 등록된 메뉴로 매장 주문을 등록할 수 있다.
- 주문 유형이 올바르지 않으면 등록할 수 없다.
- 메뉴가 없으면 등록할 수 없다.
- 매장 주문은 주문 항목의 수량이 0 미만일 수 있다.
- 매장 주문을 제외한 주문의 경우 주문 항목의 수량은 0 이상이어야 한다.
- 배달 주소가 올바르지 않으면 배달 주문을 등록할 수 없다.
  - 배달 주소는 비워 둘 수 없다.
- 빈 테이블에는 매장 주문을 등록할 수 없다.
- 숨겨진 메뉴는 주문할 수 없다.
- 주문한 메뉴의 가격은 실제 메뉴 가격과 일치해야 한다.
- 주문을 접수한다.
- 접수 대기 중인 주문만 접수할 수 있다.
- 배달 주문을 접수되면 배달 대행사를 호출한다.
- 주문을 서빙한다.
- 접수된 주문만 서빙할 수 있다.
- 주문을 배달한다.
- 배달 주문만 배달할 수 있다.
- 서빙된 주문만 배달할 수 있다.
- 주문을 배달 완료한다.
- 배달 중인 주문만 배달 완료할 수 있다.
- 주문을 완료한다.
- 배달 주문의 경우 배달 완료된 주문만 완료할 수 있다.
- 포장 및 매장 주문의 경우 서빙된 주문만 완료할 수 있다.
- 주문 테이블의 모든 매장 주문이 완료되면 빈 테이블로 설정한다.
- 완료되지 않은 매장 주문이 있는 주문 테이블은 빈 테이블로 설정하지 않는다.
- 주문 목록을 조회할 수 있다.

## 용어 사전
- 메뉴 그룹                     | MenuGroup     | 메뉴를 묶는 그룹
---
- 상품                         | Product      | 판매자가 팔고자 하는 물건 or 서비스
---
- 메뉴                         | Menu                                | 상품을 그룹화해서 전시하여 고객이 주문을 할 수 있는 단위
  - 메뉴 가격                     | MenuPrice                           | 고객이 각 메뉴의 주문 요청시 지불할 금액
  - 메뉴 전시 노출/미노출            | DisplayStatus('ACTIVE', 'INACTIVE') | 주문이 가능한 메뉴의 상태
---
- 메뉴 상품                     | MenuProduct         | 메뉴에 속하는 상품
---
- 주문                         | Order              | 고객이 상품을 소비하기 위한 일련의 과정
- 주문 항목                     | OrderLineItem      | 고객이 구매하려는 메뉴
- 주문 항목 가격                 | OrderLineItemPrice | 고객의 주문 요청 당시의 메뉴 가격
---
- 주문 유형                   | OrderType    |
  - 배달 주문                 | DELIVERY     | 배달원이 직접 상품을 전달해주는 주문
    - 접수 대기               | WAITING     | 사용자가 주문의 접수를 대기하는 상태
    - 접수                   | ACCEPTED    | 판매자가 접수 대기의 주문을 받고 준비하는 상태
    - 전달                   | SERVED      | 판매자가 상품을 배달원에게 전달한 상태
    - 배달 중                | DELIVERING   | 배달원이 상품을 가지고 배달을 시작한 상태
    - 배달 완료               | DELIVERED   | 배달원이 고객에게 상품을 전달한 상태
    - 주문 종료               | COMPLETED   | 판매자가 주문을 종료시킨 상태

  - 매장 주문                 | EAT IN      | 고객이 매장에서 직접 상품을 소비하는 주문
    - 접수 대기               | WAITING     | 사용자가 주문의 접수를 대기하는 상태
    - 접수                   | ACCEPTED    | 판매자가 접수 대기의 주문을 받고 준비하는 상태
    - 전달                   | SERVED      | 판매자가 상품을 매장의 손님에게 전달한 상태
    - 주문 종료               | COMPLETED   | 판매자가 주문을 종료시킨 상태

  - 포장 주문                 | TAKEOUT     | 고객이 매장에 방문하여 포장해가는 주문
    - 접수 대기               | WAITING     | 사용자가 주문의 접수를 대기하는 상태
    - 접수                   | ACCEPTED    | 판매자가 접수 대기의 주문을 받고 준비하는 상태
    - 전달                   | SERVED      | 판매자가 상품을 매장의 손님에게 전달한 상태
    - 주문 종료               | COMPLETED   | 판매자가 주문을 종료시킨 상태
---
- 주문 테이블                    | OrderTable           | 매장 주문 요청 고객이 상품을 소비하는 좌석
- 비어있는 주문 테이블              | NotOccupiedOrderTable | 주문완료가 되지 않은 주문이 존재하지 않아 사용이 가능한 좌석
---
- 판매자                         | Seller   | 가게 운영하는 사용자
- 고객                          | Customer | 손님
- 배달원                         | Rider    | 배달원
---
- 비속어/욕설                  | profanity

## 모델링
- MenuGroup은 name을 가지고있다


- Product은 name과 price를 가지고있다
- Menu는 반드시 하나의 MenuGroup에 속해야한다
- Menu의 price와 name과 displayStatus를 가진다
- MenuProduct은 지정한 상품의 quantity와 price와 productId를 가진다
  - quantity는 0보다 크거나 같아야한다
  - Menu의 price는 MenuProduct Price의 합보다 작거나 같아야한다


- OrderTable은 name, numberOfGuests, occupied를 가진다
- EatInOrder가 Completed될 경우 Not Occupied table은 clear


- EatInOrder는 status, orderDateTime, eatOrderLineItems, orderTableId를 가진다
  - status는 WAITING, ACCEPTED, SERVED, COMPLETED 중 하나
- EatInOrderLineItem은 menuPrice, quantity를 가진다
- EatInOrderLineItem의 menuPrice와 menu의 Price가 다를 경우 주문이 불가능하다


- DeliveryOrder는 status, orderDate, deliveryOrderLineItems, deliveryAddress를 가진다
  - status는 WAITING, ACCEPTED, SERVED, DELIVERING, DELIVERED, COMPLETED 중 하나
- DeliveryOrderLineItem은 menPrice, quantity를 가진다
- DeliveryOrderLineItem의 menuPrice와 menu의 Price가 다를 경우 주문이 불가능하다
- DeliveryOrder이 accept되면 deliveryClient에 requestDelivery


- TakeoutOrder는 status, orderDate, takeoutOrderLineItems를 가진다
  - status는 WAITING, ACCEPTED, SERVED, COMPLETED 중 하나
- TakeoutOrderLineItem은 menPrice, quantity를 가진다
- TakeoutOrderLineItem의 menuPrice와 menu의 Price가 다를 경우 주문이 불가능하다

<img width="1503" alt="Screenshot 2024-05-22 at 9 11 40 PM" src="https://github.com/next-step/ddd-strategic-design/assets/124428341/1bb3da02-bdab-4101-a33d-e7bcc4278a26">
