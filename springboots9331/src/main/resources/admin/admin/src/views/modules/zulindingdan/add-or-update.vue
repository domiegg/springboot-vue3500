<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row >
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="房屋名称" prop="fangwumingcheng">
          <el-input v-model="ruleForm.fangwumingcheng" 
              placeholder="房屋名称" clearable  :readonly="ro.fangwumingcheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="房屋名称" prop="fangwumingcheng">
              <el-input v-model="ruleForm.fangwumingcheng" 
                placeholder="房屋名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="房屋类型" prop="fangwuleixing">
          <el-input v-model="ruleForm.fangwuleixing" 
              placeholder="房屋类型" clearable  :readonly="ro.fangwuleixing"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="房屋类型" prop="fangwuleixing">
              <el-input v-model="ruleForm.fangwuleixing" 
                placeholder="房屋类型" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="24">  
        <el-form-item class="upload" v-if="type!='info' && !ro.fangwutupian" label="房屋图片" prop="fangwutupian">
          <file-upload
          tip="点击上传房屋图片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.fangwutupian?ruleForm.fangwutupian:''"
          @change="fangwutupianUploadChange"
          ></file-upload>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.fangwutupian" label="房屋图片" prop="fangwutupian">
            <img style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.fangwutupian.split(',')" :src="$base.url+item" width="100" height="100">
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="房屋面积" prop="fangwumianji">
          <el-input v-model="ruleForm.fangwumianji" 
              placeholder="房屋面积" clearable  :readonly="ro.fangwumianji"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="房屋面积" prop="fangwumianji">
              <el-input v-model="ruleForm.fangwumianji" 
                placeholder="房屋面积" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="房屋租金" prop="fangwuzujin">
          <el-input v-model="ruleForm.fangwuzujin" 
              placeholder="房屋租金" clearable  :readonly="ro.fangwuzujin"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="房屋租金" prop="fangwuzujin">
              <el-input v-model="ruleForm.fangwuzujin" 
                placeholder="房屋租金" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="租赁月数" prop="zulinyueshu">
          <el-input v-model="ruleForm.zulinyueshu" 
              placeholder="租赁月数" clearable  :readonly="ro.zulinyueshu"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="租赁月数" prop="zulinyueshu">
              <el-input v-model="ruleForm.zulinyueshu" 
                placeholder="租赁月数" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="订单金额" prop="dingdanjine">
            <el-input v-model="dingdanjine"
                placeholder="订单金额" readonly></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.dingdanjine" label="订单金额" prop="dingdanjine">
              <el-input v-model="ruleForm.dingdanjine" 
                placeholder="订单金额" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="订单备注" prop="dingdanbeizhu">
          <el-input v-model="ruleForm.dingdanbeizhu" 
              placeholder="订单备注" clearable  :readonly="ro.dingdanbeizhu"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="订单备注" prop="dingdanbeizhu">
              <el-input v-model="ruleForm.dingdanbeizhu" 
                placeholder="订单备注" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="房主账号" prop="fangzhuzhanghao">
          <el-input v-model="ruleForm.fangzhuzhanghao" 
              placeholder="房主账号" clearable  :readonly="ro.fangzhuzhanghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="房主账号" prop="fangzhuzhanghao">
              <el-input v-model="ruleForm.fangzhuzhanghao" 
                placeholder="房主账号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="评价状态" prop="pingjiazhuangtai">
          <el-select :disabled="ro.pingjiazhuangtai" v-model="ruleForm.pingjiazhuangtai" placeholder="请选择评价状态">
            <el-option
                v-for="(item,index) in pingjiazhuangtaiOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="评价状态" prop="pingjiazhuangtai">
	      <el-input v-model="ruleForm.pingjiazhuangtai"
                placeholder="评价状态" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="租赁日期" prop="zulinriqi">
            <el-date-picker
                format="yyyy 年 MM 月 dd 日"
                value-format="yyyy-MM-dd"
                v-model="ruleForm.zulinriqi" 
                type="date"
                :readonly="ro.zulinriqi"
                placeholder="租赁日期">
            </el-date-picker> 
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.zulinriqi" label="租赁日期" prop="zulinriqi">
              <el-input v-model="ruleForm.zulinriqi" 
                placeholder="租赁日期" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="用户名" prop="yonghuming">
          <el-input v-model="ruleForm.yonghuming" 
              placeholder="用户名" clearable  :readonly="ro.yonghuming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="用户名" prop="yonghuming">
              <el-input v-model="ruleForm.yonghuming" 
                placeholder="用户名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming" 
              placeholder="姓名" clearable  :readonly="ro.xingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="姓名" prop="xingming">
              <el-input v-model="ruleForm.xingming" 
                placeholder="姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="手机" prop="shouji">
          <el-input v-model="ruleForm.shouji" 
              placeholder="手机" clearable  :readonly="ro.shouji"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="手机" prop="shouji">
              <el-input v-model="ruleForm.shouji" 
                placeholder="手机" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="身份证" prop="shenfenzheng">
          <el-input v-model="ruleForm.shenfenzheng" 
              placeholder="身份证" clearable  :readonly="ro.shenfenzheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="身份证" prop="shenfenzheng">
              <el-input v-model="ruleForm.shenfenzheng" 
                placeholder="身份证" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      </el-row>
      <el-form-item class="btn">
        <el-button  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"rgba(45, 103, 81, 1)","selectFontSize":"14px","btnCancelBorderColor":"rgba(112, 112, 112, 1)","inputBorderRadius":"0","inputFontSize":"14px","textareaBgColor":"#fff","btnSaveFontSize":"18px","textareaBorderRadius":"0","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"145px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"44px","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"rgba(0, 0, 0, 1)","addEditBoxColor":"rgba(255, 255, 255, 1)","dateIconFontSize":"14px","btnSaveBgColor":"rgba(237, 247, 255, 1)","uploadIconFontColor":"#8c939d","textareaBorderColor":"rgba(112, 112, 112, 1)","btnCancelBgColor":"rgba(232, 232, 232, 1)","selectLableColor":"rgba(0, 0, 0, 1)","btnSaveBorderStyle":"dashed","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"0","btnCancelBorderStyle":"dashed","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"#C0C4CC","btnCancelHeight":"50px","inputHeight":"40px","btnCancelFontColor":"rgba(112, 112, 112, 1)","dateBorderColor":"rgba(112, 112, 112, 1)","dateIconFontColor":"#C0C4CC","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"rgba(0, 0, 0, 1)","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"rgba(0, 0, 0, 1)","uploadHeight":"148px","textareaLableColor":"rgba(0, 0, 0, 1)","textareaLableFontSize":"14px","btnCancelFontSize":"18px","inputBorderStyle":"solid","btnCancelBorderRadius":"44px","inputBgColor":"#fff","inputLableFontSize":"14px","uploadLableColor":"rgba(0, 0, 0, 1)","uploadBorderRadius":"0","btnSaveHeight":"50px","selectBgColor":"#fff","btnSaveWidth":"145px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"rgba(112, 112, 112, 1)","inputBorderColor":"rgba(112, 112, 112, 1)","uploadBorderColor":"rgba(112, 112, 112, 1)","textareaFontColor":"rgba(0, 0, 0, 1)","selectBorderWidth":"1px","dateFontColor":"rgba(0, 0, 0, 1)","btnCancelBorderWidth":"4px","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"0","selectFontColor":"rgba(0, 0, 0, 1)","btnSaveBorderColor":"rgba(45, 103, 81, 1)","btnSaveBorderWidth":"4px"},
      id: '',
      type: '',
      ro:{
	fangwumingcheng : false,
	fangwuleixing : false,
	fangwutupian : false,
	fangwumianji : false,
	fangwuzujin : false,
	zulinyueshu : false,
	dingdanjine : false,
	dingdanbeizhu : false,
	fangzhuzhanghao : false,
	pingjiazhuangtai : false,
	zulinriqi : false,
	yonghuming : false,
	xingming : false,
	shouji : false,
	shenfenzheng : false,
	sfsh : false,
	shhf : false,
	ispay : false,
      },
      ruleForm: {
        fangwumingcheng: '',
        fangwuleixing: '',
        fangwutupian: '',
        fangwumianji: '',
        fangwuzujin: '',
        zulinyueshu: '',
        dingdanjine: '',
        dingdanbeizhu: '',
        fangzhuzhanghao: '',
       pingjiazhuangtai: '未评价',
        zulinriqi: '',
        yonghuming: '',
        xingming: '',
        shouji: '',
        shenfenzheng: '',
        shhf: '',
      },
          pingjiazhuangtaiOptions: [],
      rules: {
          fangwumingcheng: [
          ],
          fangwuleixing: [
          ],
          fangwutupian: [
          ],
          fangwumianji: [
          ],
          fangwuzujin: [
                { validator: validateIntNumber, trigger: 'blur' },
          ],
          zulinyueshu: [
                { required: true, message: '租赁月数不能为空', trigger: 'blur' },
                { validator: validateIntNumber, trigger: 'blur' },
          ],
          dingdanjine: [
                { validator: validateIntNumber, trigger: 'blur' },
          ],
          dingdanbeizhu: [
          ],
          fangzhuzhanghao: [
          ],
          pingjiazhuangtai: [
          ],
          zulinriqi: [
          ],
          yonghuming: [
          ],
          xingming: [
          ],
          shouji: [
                { validator: validateMobile, trigger: 'blur' },
          ],
          shenfenzheng: [
                { validator: validateIdCard, trigger: 'blur' },
          ],
          sfsh: [
          ],
          shhf: [
          ],
          ispay: [
          ],
      }
    };
  },
  props: ["parent"],
  computed: {


    dingdanjine:{
      get: function () {
        return 1*this.ruleForm.fangwuzujin*this.ruleForm.zulinyueshu
      }
    },

  },
  created() {
	this.ruleForm.zulinriqi = this.getCurDate()
	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
    // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='logistics'){
        this.logistics=false;
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          if(o=='fangwumingcheng'){
            this.ruleForm.fangwumingcheng = obj[o];
	    this.ro.fangwumingcheng = true;
            continue;
          }
          if(o=='fangwuleixing'){
            this.ruleForm.fangwuleixing = obj[o];
	    this.ro.fangwuleixing = true;
            continue;
          }
          if(o=='fangwutupian'){
            this.ruleForm.fangwutupian = obj[o];
	    this.ro.fangwutupian = true;
            continue;
          }
          if(o=='fangwumianji'){
            this.ruleForm.fangwumianji = obj[o];
	    this.ro.fangwumianji = true;
            continue;
          }
          if(o=='fangwuzujin'){
            this.ruleForm.fangwuzujin = obj[o];
	    this.ro.fangwuzujin = true;
            continue;
          }
          if(o=='zulinyueshu'){
            this.ruleForm.zulinyueshu = obj[o];
	    this.ro.zulinyueshu = true;
            continue;
          }
          if(o=='dingdanjine'){
            this.ruleForm.dingdanjine = obj[o];
	    this.ro.dingdanjine = true;
            continue;
          }
          if(o=='dingdanbeizhu'){
            this.ruleForm.dingdanbeizhu = obj[o];
	    this.ro.dingdanbeizhu = true;
            continue;
          }
          if(o=='fangzhuzhanghao'){
            this.ruleForm.fangzhuzhanghao = obj[o];
	    this.ro.fangzhuzhanghao = true;
            continue;
          }
          if(o=='pingjiazhuangtai'){
            this.ruleForm.pingjiazhuangtai = obj[o];
	    this.ro.pingjiazhuangtai = true;
            continue;
          }
          if(o=='zulinriqi'){
            this.ruleForm.zulinriqi = obj[o];
	    this.ro.zulinriqi = true;
            continue;
          }
          if(o=='yonghuming'){
            this.ruleForm.yonghuming = obj[o];
	    this.ro.yonghuming = true;
            continue;
          }
          if(o=='xingming'){
            this.ruleForm.xingming = obj[o];
	    this.ro.xingming = true;
            continue;
          }
          if(o=='shouji'){
            this.ruleForm.shouji = obj[o];
	    this.ro.shouji = true;
            continue;
          }
          if(o=='shenfenzheng'){
            this.ruleForm.shenfenzheng = obj[o];
	    this.ro.shenfenzheng = true;
            continue;
          }
        }
      }
      // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
		if(this.$storage.get("role")!="管理员") {
			this.ro.fangwumingcheng = true;
		}
		if(this.$storage.get("role")!="管理员") {
			this.ro.fangwuleixing = true;
		}
		if(this.$storage.get("role")!="管理员") {
			this.ro.fangwutupian = true;
		}
		if(this.$storage.get("role")!="管理员") {
			this.ro.fangwuzujin = true;
		}
		if(this.$storage.get("role")!="管理员") {
			this.ro.dingdanjine = true;
		}
		if(this.$storage.get("role")!="管理员") {
			this.ro.fangzhuzhanghao = true;
		}
		if(this.$storage.get("role")!="管理员") {
			this.ro.pingjiazhuangtai = true;
		}
		if(json.yonghuming!=''&&json.yonghuming){
                this.ruleForm.yonghuming = json.yonghuming
	    		this.ro.yonghuming = true;
		}
		if(json.xingming!=''&&json.xingming){
                this.ruleForm.xingming = json.xingming
	    		this.ro.xingming = true;
		}
		if(json.shouji!=''&&json.shouji){
                this.ruleForm.shouji = json.shouji
	    		this.ro.shouji = true;
		}
		if(json.shenfenzheng!=''&&json.shenfenzheng){
                this.ruleForm.shenfenzheng = json.shenfenzheng
	    		this.ro.shenfenzheng = true;
		}
        } else {
          this.$message.error(data.msg);
        }
      });
            this.pingjiazhuangtaiOptions = "已评价,未评价".split(',')
    },
    // 多级联动参数
    info(id) {
      this.$http({
        url: `zulindingdan/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {
        this.ruleForm.dingdanjine = this.dingdanjine






	if(this.ruleForm.fangwutupian!=null) {
		this.ruleForm.fangwutupian = this.ruleForm.fangwutupian.replace(new RegExp(this.$base.url,"g"),"");
	}































var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(!statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "zulindingdan/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `zulindingdan/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.zulindingdanCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `zulindingdan/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.zulindingdanCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
			   }
			 });
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.zulindingdanCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    fangwutupianUploadChange(fileUrls) {
	this.ruleForm.fangwutupian = fileUrls;
	this.addEditUploadStyleChange()
    },
	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
	background-color: transparent;
}
.btn .el-button {
  padding: 0;
}
</style>
