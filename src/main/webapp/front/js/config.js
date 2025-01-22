
var projectName = '协同过滤算法的电影推荐系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '免费电影',
	url: './pages/mianfeidianying/list.html'
}, 
{
	name: '付费电影',
	url: './pages/fufeidianying/list.html'
}, 

{
	name: '电影论坛',
	url: './pages/forum/list.html'
}, 
{
	name: '电影资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssmf7s0a/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["新增","查看","修改","删除"],"menu":"电影分类","menuJump":"列表","tableName":"dianyingfenlei"}],"menu":"电影分类管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["新增","查看","修改","删除","查看评论"],"menu":"免费电影","menuJump":"列表","tableName":"mianfeidianying"}],"menu":"免费电影管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除","查看评论"],"menu":"付费电影","menuJump":"列表","tableName":"fufeidianying"}],"menu":"付费电影管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","修改","删除","我的电影"],"menu":"电影订单","menuJump":"列表","tableName":"dianyingdingdan"}],"menu":"电影订单管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","删除"],"menu":"我的电影","menuJump":"列表","tableName":"wodedianying"}],"menu":"我的电影管理"},{"child":[{"appFrontIcon":"cuIcon-group","buttons":["查看","修改","删除"],"menu":"电影论坛","tableName":"forum"}],"menu":"电影论坛"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"电影资讯","tableName":"news"},{"appFrontIcon":"cuIcon-send","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","查看评论"],"menu":"免费电影列表","menuJump":"列表","tableName":"mianfeidianying"}],"menu":"免费电影模块"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","立即付费","查看评论"],"menu":"付费电影列表","menuJump":"列表","tableName":"fufeidianying"}],"menu":"付费电影模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","删除","支付"],"menu":"电影订单","menuJump":"列表","tableName":"dianyingdingdan"}],"menu":"电影订单管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看"],"menu":"我的电影","menuJump":"列表","tableName":"wodedianying"}],"menu":"我的电影管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","查看评论"],"menu":"免费电影列表","menuJump":"列表","tableName":"mianfeidianying"}],"menu":"免费电影模块"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","立即付费","查看评论"],"menu":"付费电影列表","menuJump":"列表","tableName":"fufeidianying"}],"menu":"付费电影模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
