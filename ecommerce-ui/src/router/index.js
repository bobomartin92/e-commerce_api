import { createRouter, createWebHashHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import AddCategory from "@/views/Category/AddCategory.vue";
import Category from "@/views/Category/Category.vue";
import EditCategory from "@/views/Category/EditCategory.vue";
import AddProduct from "@/views/Product/AddProduct.vue";
import Product from "@/views/Product/Product.vue";
import EditProduct from "@/views/Product/EditProduct.vue";
import ShowProduct from "@/views/Product/ShowProduct.vue";
import Signup from "@/views/Signup.vue";
import Signin from "@/views/Signin.vue";
import WishList from "@/views/Product/WishList.vue";
import Cart from "@/views/Cart/Cart.vue";
import Success from "@/views/Payment/Success.vue";
import Failed from "@/views/Payment/Failed.vue";
import Checkout from "@/views/Checkout/Checkout.vue";
import OrderHistory from "@/views/Order/OrderHistory.vue";
import OrderDetails from "@/views/Order/OrderDetails.vue";

const routes = [
  {
    path: '/',
    name: 'Home',
    component: HomeView
  },
  {
    path: "/admin/category/add",
    name: "AddCategory",
    component: AddCategory,
  },
  {
    path: "/admin/category",
    name: "AdminCategory",
    component: Category,
  },
  {
    path: "/admin/category/:id",
    name: "EditCategory",
    component: EditCategory,
    props: true,
  },
  {
    path: "/admin/product/add",
    name: "AddProduct",
    component: AddProduct,
  },
  {
    path: "/admin/product",
    name: "AdminProduct",
    component: Product,
  },
  {
    path: "/admin/product/:id",
    name: "EditProduct",
    component: EditProduct,
    props: true,
  },
  {
    path : '/product/show/:id',
    name : 'ShowProduct',
    component: ShowProduct,
    props: true,
  },
  {
    path: '/signup',
    name: 'Signup',
    component: Signup
  },
  {
    path: '/signin',
    name: 'Signin',
    component: Signin
  },
  {
    path: '/wishlist',
    name: 'WishList',
    component: WishList
  },
  {
    path : '/cart',
    name : 'Cart',
    component : Cart
  },
  {
    path: '/payment/success',
    name: 'PaymentSuccess',
    component:Success
  },
  {
    path: '/payment/failed',
    name: 'FailedPayment',
    component:Failed
  },
  {
    path : '/checkout',
    name : 'Checkout',
    component : Checkout
  },
  {
    path: '/orders',
    name: 'OrderHistory',
    component: OrderHistory
  },
  {
    path:'/order/:id',
    name:'OrderDetails',
    component: OrderDetails,
    props: true,
  },
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
