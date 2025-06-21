
var projectName = '大学生租房系统';
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
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '房屋信息',
	url: './pages/fangwuxinxi/list.html'
}, 
{
	name: '房屋评价',
	url: './pages/fangwupingjia/list.html'
}, 

{
	name: '公告资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springboots9331/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-send","buttons":["新增","查看","修改","删除"],"menu":"房主","menuJump":"列表","tableName":"fangzhu"}],"menu":"房主管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["新增","查看","修改","删除"],"menu":"房屋类型","menuJump":"列表","tableName":"fangwuleixing"}],"menu":"房屋类型管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","修改","删除"],"menu":"房屋信息","menuJump":"列表","tableName":"fangwuxinxi"}],"menu":"房屋信息管理"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看","修改","删除"],"menu":"预约看房","menuJump":"列表","tableName":"yuyuekanfang"}],"menu":"预约看房管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","修改","删除"],"menu":"定金留房","menuJump":"列表","tableName":"dingjinliufang"}],"menu":"定金留房管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","修改","删除"],"menu":"租赁订单","menuJump":"列表","tableName":"zulindingdan"}],"menu":"租赁订单管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","修改","删除"],"menu":"房屋评价","menuJump":"列表","tableName":"fangwupingjia"}],"menu":"房屋评价管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["新增","查看","修改","删除"],"menu":"消息提醒","menuJump":"列表","tableName":"xiaoxitixing"}],"menu":"消息提醒管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告资讯","tableName":"news"},{"appFrontIcon":"cuIcon-service","buttons":["新增","查看","修改","删除"],"menu":"意见反馈","tableName":"chat"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","预约看房","定金留房"],"menu":"房屋信息列表","menuJump":"列表","tableName":"fangwuxinxi"}],"menu":"房屋信息模块"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看"],"menu":"房屋评价列表","menuJump":"列表","tableName":"fangwupingjia"}],"menu":"房屋评价模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除"],"menu":"房屋信息","menuJump":"列表","tableName":"fangwuxinxi"}],"menu":"房屋信息管理"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看","审核"],"menu":"预约看房","menuJump":"列表","tableName":"yuyuekanfang"}],"menu":"预约看房管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看"],"menu":"定金留房","menuJump":"列表","tableName":"dingjinliufang"}],"menu":"定金留房管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","审核"],"menu":"租赁订单","menuJump":"列表","tableName":"zulindingdan"}],"menu":"租赁订单管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看"],"menu":"房屋评价","menuJump":"列表","tableName":"fangwupingjia"}],"menu":"房屋评价管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","预约看房","定金留房"],"menu":"房屋信息列表","menuJump":"列表","tableName":"fangwuxinxi"}],"menu":"房屋信息模块"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看"],"menu":"房屋评价列表","menuJump":"列表","tableName":"fangwupingjia"}],"menu":"房屋评价模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"房主","tableName":"fangzhu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看"],"menu":"预约看房","menuJump":"列表","tableName":"yuyuekanfang"}],"menu":"预约看房管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","支付","租赁下单"],"menu":"定金留房","menuJump":"列表","tableName":"dingjinliufang"}],"menu":"定金留房管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","支付","房屋评价"],"menu":"租赁订单","menuJump":"列表","tableName":"zulindingdan"}],"menu":"租赁订单管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看"],"menu":"房屋评价","menuJump":"列表","tableName":"fangwupingjia"}],"menu":"房屋评价管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"消息提醒","menuJump":"列表","tableName":"xiaoxitixing"}],"menu":"消息提醒管理"},{"child":[{"appFrontIcon":"cuIcon-favor","buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","预约看房","定金留房"],"menu":"房屋信息列表","menuJump":"列表","tableName":"fangwuxinxi"}],"menu":"房屋信息模块"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看"],"menu":"房屋评价列表","menuJump":"列表","tableName":"fangwupingjia"}],"menu":"房屋评价模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


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
