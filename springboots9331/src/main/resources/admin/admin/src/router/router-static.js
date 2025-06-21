import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import fangwuleixing from '@/views/modules/fangwuleixing/list'
    import news from '@/views/modules/news/list'
    import zulindingdan from '@/views/modules/zulindingdan/list'
    import storeup from '@/views/modules/storeup/list'
    import fangwupingjia from '@/views/modules/fangwupingjia/list'
    import xiaoxitixing from '@/views/modules/xiaoxitixing/list'
    import fangwuxinxi from '@/views/modules/fangwuxinxi/list'
    import yuyuekanfang from '@/views/modules/yuyuekanfang/list'
    import fangzhu from '@/views/modules/fangzhu/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chat from '@/views/modules/chat/list'
    import dingjinliufang from '@/views/modules/dingjinliufang/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/fangwuleixing',
        name: '房屋类型',
        component: fangwuleixing
      }
      ,{
	path: '/news',
        name: '公告资讯',
        component: news
      }
      ,{
	path: '/zulindingdan',
        name: '租赁订单',
        component: zulindingdan
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/fangwupingjia',
        name: '房屋评价',
        component: fangwupingjia
      }
      ,{
	path: '/xiaoxitixing',
        name: '消息提醒',
        component: xiaoxitixing
      }
      ,{
	path: '/fangwuxinxi',
        name: '房屋信息',
        component: fangwuxinxi
      }
      ,{
	path: '/yuyuekanfang',
        name: '预约看房',
        component: yuyuekanfang
      }
      ,{
	path: '/fangzhu',
        name: '房主',
        component: fangzhu
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/chat',
        name: '意见反馈',
        component: chat
      }
      ,{
	path: '/dingjinliufang',
        name: '定金留房',
        component: dingjinliufang
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
