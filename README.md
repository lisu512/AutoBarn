
### 1. 库存管理

#### 增加库存物品
- **POST** `/api/inventory`
  - 请求体示例：
    ```json
    {
      "name": "电子产品",
      "quantity": 100,
      "description": "高性能电子设备"
    }
    ```
  - 响应体示例：
    ```json
    {
      "id": 1,
      "name": "电子产品",
      "quantity": 100,
      "description": "高性能电子设备"
    }
    ```

#### 更新库存信息
- **PUT** `/api/inventory/{itemId}`
  - 请求体示例：
    ```json
    {
      "quantity": 150,
      "description": "更新后的库存描述"
    }
    ```
  - 响应体示例：
    ```json
    {
      "id": 1,
      "name": "电子产品",
      "quantity": 150,
      "description": "更新后的库存描述"
    }
    ```

### 2. 订单处理

#### 创建订单
- **POST** `/api/orders`
  - 请求体示例：
    ```json
    {
      "items": [
        {
          "itemId": 1,
          "quantity": 2
        },
        {
          "itemId": 2,
          "quantity": 3
        }
      ],
      "customer": {
        "name": "张三",
        "address": "北京市朝阳区"
      }
    }
    ```
  - 响应体示例：
    ```json
    {
      "orderId": 101,
      "status": "已创建",
      "items": [
        {
          "itemId": 1,
          "quantity": 2
        },
        {
          "itemId": 2,
          "quantity": 3
        }
      ],
      "customer": {
        "name": "张三",
        "address": "北京市朝阳区"
      }
    }
    ```

#### 更新订单状态
- **PUT** `/api/orders/{orderId}`
  - 请求体示例：
    ```json
    {
      "status": "已发货"
    }
    ```
  - 响应体示例：
    ```json
    {
      "orderId": 101,
      "status": "已发货"
    }
    ```

### 3. 用户管理

#### 用户注册
- **POST** `/api/users`
  - 请求体示例：
    ```json
    {
      "username": "user01",
      "password": "password123",
      "email": "user01@example.com"
    }
    ```
  - 响应体示例：
    ```json
    {
      "userId": 1,
      "username": "user01",
      "email": "user01@example.com",
      "registeredAt": "2024-04-25T09:00:00Z"
    }
    ```

#### 用户登录
- **POST** `/api/users/login`
  - 请求体示例：
    ```json
    {
      "username": "user01",
      "password": "password123"
    }
    ```
  - 响应体示例：
    ```json
    {
      "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
    }
    ```

