const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmf7s0a/",
            name: "ssmf7s0a",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmf7s0a/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "协同过滤算法的电影推荐系统"
        } 
    }
}
export default base
