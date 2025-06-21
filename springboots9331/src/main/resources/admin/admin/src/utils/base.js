const base = {
    get() {
        return {
            url : "http://localhost:8080/springboots9331/",
            name: "springboots9331",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboots9331/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "大学生租房系统"
        } 
    }
}
export default base
