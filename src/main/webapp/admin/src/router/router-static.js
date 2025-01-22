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
    import forum from '@/views/modules/forum/list'
    import news from '@/views/modules/news/list'
    import dianyingdingdan from '@/views/modules/dianyingdingdan/list'
    import mianfeidianying from '@/views/modules/mianfeidianying/list'
    import yonghu from '@/views/modules/yonghu/list'
    import discussfufeidianying from '@/views/modules/discussfufeidianying/list'
    import fufeidianying from '@/views/modules/fufeidianying/list'
    import discussmianfeidianying from '@/views/modules/discussmianfeidianying/list'
    import wodedianying from '@/views/modules/wodedianying/list'
    import dianyingfenlei from '@/views/modules/dianyingfenlei/list'
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
	path: '/forum',
        name: '电影论坛',
        component: forum
      }
      ,{
	path: '/news',
        name: '电影资讯',
        component: news
      }
      ,{
	path: '/dianyingdingdan',
        name: '电影订单',
        component: dianyingdingdan
      }
      ,{
	path: '/mianfeidianying',
        name: '免费电影',
        component: mianfeidianying
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/discussfufeidianying',
        name: '付费电影评论',
        component: discussfufeidianying
      }
      ,{
	path: '/fufeidianying',
        name: '付费电影',
        component: fufeidianying
      }
      ,{
	path: '/discussmianfeidianying',
        name: '免费电影评论',
        component: discussmianfeidianying
      }
      ,{
	path: '/wodedianying',
        name: '我的电影',
        component: wodedianying
      }
      ,{
	path: '/dianyingfenlei',
        name: '电影分类',
        component: dianyingfenlei
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
