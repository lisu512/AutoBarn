
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

  - 运行测试截图：  
  [![2024-04-29-204903.png](https://i.postimg.cc/m2hzY8Yr/2024-04-29-204903.png)](https://postimg.cc/7f8ZD1Qv)

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

  - 运行测试截图：  
  [![2024-04-29-205740.png](https://i.postimg.cc/nrKJB83W/2024-04-29-205740.png)](https://postimg.cc/FkK8X65b)

### 2. 订单处理

#### 创建订单
- **POST** `/api/orders`
  - 请求体示例：
    ```json
    {
      "status": "已下单",
      "customerName": "张三",
      "customerAddress": "北京市朝阳区某某街道123号"
    }
    ```
  - 响应体示例：
    ```json
    {
      "status": "已下单",
      "customerName": "张三",
      "customerAddress": "北京市朝阳区某某街道123号"
    }
    ```

  - 运行测试截图：  
  [![2024-04-29-210723.png](https://i.postimg.cc/ZYjZbmy9/2024-04-29-210723.png)](https://postimg.cc/nMsN262Z)

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

  - 运行测试截图：  
  [![2024-04-29-211006.png](https://i.postimg.cc/MKhLx3tM/2024-04-29-211006.png)](https://postimg.cc/tYNkN5Kp)


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
    "username": "user01",
    "email": "user01@example.com",
    "password": null,
    "registeredAt": "2024-04-29T12:24:21.510763700Z"
    }
    ```

  - 运行测试截图：  
  [![2024-04-29-203919.png](https://i.postimg.cc/TYyMqDpx/2024-04-29-203919.png)](https://postimg.cc/JGW2RtNY)

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

  - 运行测试截图：  
  [![2024-04-29-204618.png](https://i.postimg.cc/GtXDcfvW/2024-04-29-204618.png)](https://postimg.cc/4HhyPBLP)

