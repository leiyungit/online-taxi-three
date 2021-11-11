
 <h1 class="curproject-name"> 数据字典 </h1> 
 数据结构设计


# 公共分类

## 乘客端,司机端，车机端app更新
<a id=乘客端,司机端，车机端app更新> </a>
### 基本信息

**Path：** /tbl_app_version_update

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(16) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td>id</td>
</tr>
<tr>
<td>platform</td>
<td>smallint(6)</td>
<td>NO</td>
<td></td>
<td>上线系统 平台 1: ios, 2: android</td>
</tr>
<tr>
<td>notice_type</td>
<td>smallint(6)</td>
<td>NO</td>
<td></td>
<td>通知类型（1:强制 2:非强制）</td>
</tr>
<tr>
<td>prompt</td>
<td>varchar(50)</td>
<td>NO</td>
<td></td>
<td>升级提示（不超过30个字）</td>
</tr>
<tr>
<td>note</td>
<td>varchar(500)</td>
<td>NO</td>
<td></td>
<td>备注</td>
</tr>
<tr>
<td>start_time</td>
<td>datetime</td>
<td>NO</td>
<td></td>
<td>生效开始时间</td>
</tr>
<tr>
<td>end_time</td>
<td>datetime</td>
<td>NO</td>
<td></td>
<td>生效结束时间</td>
</tr>
<tr>
<td>download_url</td>
<td>varchar(500)</td>
<td>NO</td>
<td></td>
<td>安装包url</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>operator_id</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td>创建人</td>
</tr>
<tr>
<td>app_type</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>1:乘客端，2：司机端 3:车机端</td>
</tr>
<tr>
<td>app_version</td>
<td>varchar(16)</td>
<td>NO</td>
<td></td>
<td>app版本号</td>
</tr>
<tr>
<td>use_status</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>启用停用状态，0：停用，1：启用</td>
</tr>
<tr>
<td>version_code</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td>版本号code</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>更新时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 广告位
<a id=广告位> </a>
### 基本信息

**Path：** /tbl_ad_position

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(16) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td>广告位id</td>
</tr>
<tr>
<td>position_name</td>
<td>varchar(255)</td>
<td>NO</td>
<td></td>
<td>广告位名称</td>
</tr>
<tr>
<td>position_desc</td>
<td>text</td>
<td>NO</td>
<td></td>
<td>广告位描述</td>
</tr>
<tr>
<td>position_type</td>
<td>tinyint(1)</td>
<td>NO</td>
<td></td>
<td>广告位类型（1：客户端；2：大屏端）</td>
</tr>
<tr>
<td>status</td>
<td>tinyint(1)</td>
<td>NO</td>
<td></td>
<td>状态（0：暂停；1：开启）</td>
</tr>
<tr>
<td>most_count</td>
<td>tinyint(3)</td>
<td>NO</td>
<td></td>
<td>广告上限</td>
</tr>
<tr>
<td>content_type</td>
<td>tinyint(1)</td>
<td>NO</td>
<td></td>
<td>内容类型（1：视频；2：图片）</td>
</tr>
<tr>
<td>operator_user</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>操作者</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>更新时间</td>
</tr>
</tbody>
</table>


### 请求参数

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody">
               </tbody>
              </table>
            
## 广告
<a id=广告> </a>
### 基本信息

**Path：** /tbl_ads

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(16) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>down_load_url</td>
<td>varchar(255)</td>
<td>NO</td>
<td></td>
<td>视频/图片地址</td>
</tr>
<tr>
<td>link_url</td>
<td>varchar(255)</td>
<td>NO</td>
<td></td>
<td>链接地址</td>
</tr>
<tr>
<td>video_img</td>
<td>varchar(255)</td>
<td>NO</td>
<td></td>
<td>视频图片</td>
</tr>
<tr>
<td>position_id</td>
<td>int(16)</td>
<td>NO</td>
<td></td>
<td>广告位id</td>
</tr>
<tr>
<td>start_time</td>
<td>datetime</td>
<td>NO</td>
<td></td>
<td>开始时间</td>
</tr>
<tr>
<td>end_time</td>
<td>datetime</td>
<td>NO</td>
<td></td>
<td>结束时间</td>
</tr>
<tr>
<td>city</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>展示城市</td>
</tr>
<tr>
<td>name</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>广告名称</td>
</tr>
<tr>
<td>platform</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>平台</td>
</tr>
<tr>
<td>type</td>
<td>tinyint(1)</td>
<td>NO</td>
<td></td>
<td>1：视频；2：图片</td>
</tr>
<tr>
<td>people_tag_id</td>
<td>tinyint(3)</td>
<td>NO</td>
<td></td>
<td>人群模板id</td>
</tr>
<tr>
<td>status</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td>1启用0停用</td>
</tr>
<tr>
<td>operator_user</td>
<td>int(10)</td>
<td>YES</td>
<td></td>
<td>操作人</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>更新时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 司机反馈
<a id=司机反馈> </a>
### 基本信息

**Path：** /tbl_driver_advice

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>driver_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>司机id</td>
</tr>
<tr>
<td>advice_type</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>反馈类型</td>
</tr>
<tr>
<td>advice_desc</td>
<td>varchar(255)</td>
<td>NO</td>
<td></td>
<td>反馈内容</td>
</tr>
<tr>
<td>phone</td>
<td>varchar(30)</td>
<td>NO</td>
<td></td>
<td>司机电话</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>更新时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 发票
<a id=发票> </a>
### 基本信息

**Path：** /tbl_invoice_record

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(16)</td>
<td>NO</td>
<td>auto_increment</td>
<td>发票ID</td>
</tr>
<tr>
<td>passenger_info_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>乘客ID</td>
</tr>
<tr>
<td>order_id_list</td>
<td>varchar(512)</td>
<td>NO</td>
<td></td>
<td>订单list，逗号分隔</td>
</tr>
<tr>
<td>invoice_price</td>
<td>decimal(10,2) unsigned</td>
<td>NO</td>
<td></td>
<td>发票总价</td>
</tr>
<tr>
<td>invoice_status</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>1：待开票（申请开票）, 2：待邮寄, 3：已邮寄, 4：已撤销,</td>
</tr>
<tr>
<td>invoice_type</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>发票类型：1：普票，2：专票</td>
</tr>
<tr>
<td>invoice_body</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>发票主体：1：个人，2：企业</td>
</tr>
<tr>
<td>invoice_title</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>发票抬头</td>
</tr>
<tr>
<td>invoice_content</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>发票内容</td>
</tr>
<tr>
<td>taxpayer_id</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>纳税人识别号</td>
</tr>
<tr>
<td>reg_address</td>
<td>varchar(256)</td>
<td>NO</td>
<td></td>
<td>注册地址</td>
</tr>
<tr>
<td>reg_phone</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>注册电话</td>
</tr>
<tr>
<td>deposit_bank</td>
<td>varchar(218)</td>
<td>NO</td>
<td></td>
<td>开户银行</td>
</tr>
<tr>
<td>bank_account</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>银行账号</td>
</tr>
<tr>
<td>receiver_name</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>收件人姓名</td>
</tr>
<tr>
<td>receiver_phone</td>
<td>varchar(16)</td>
<td>NO</td>
<td></td>
<td>收件人电话</td>
</tr>
<tr>
<td>receiver_address</td>
<td>varchar(256)</td>
<td>NO</td>
<td></td>
<td>收件人地址</td>
</tr>
<tr>
<td>create_time</td>
<td>datetime</td>
<td>NO</td>
<td></td>
<td>申请开票时间</td>
</tr>
<tr>
<td>express_company</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>快递公司</td>
</tr>
<tr>
<td>express_num</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>快递号</td>
</tr>
<tr>
<td>express_time</td>
<td>datetime</td>
<td>NO</td>
<td></td>
<td>邮寄时间</td>
</tr>
<tr>
<td>reject_id</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>驳回原因ID</td>
</tr>
<tr>
<td>cancel_desc</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>撤销原因</td>
</tr>
<tr>
<td>email</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>邮件地址</td>
</tr>
<tr>
<td>invoice_number</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>发票号</td>
</tr>
<tr>
<td>express_company_name</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>快递公司名称</td>
</tr>
</tbody>
</table>


### 请求参数

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody">
               </tbody>
              </table>
            
## 消息模板
<a id=消息模板> </a>
### 基本信息

**Path：** /tbl_sms_app_template

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10)</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>template_name</td>
<td>varchar(255)</td>
<td>NO</td>
<td></td>
<td>模板名称</td>
</tr>
<tr>
<td>template_type</td>
<td>tinyint(3)</td>
<td>NO</td>
<td></td>
<td>模板类型（1：营销；2：通知）</td>
</tr>
<tr>
<td>content</td>
<td>text</td>
<td>NO</td>
<td></td>
<td>模板内容</td>
</tr>
<tr>
<td>operator_user</td>
<td>int(10)</td>
<td>YES</td>
<td></td>
<td>操作者</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>更新时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 消息推送记录
<a id=消息推送记录> </a>
### 基本信息

**Path：** /tbl_sms_send_app

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>name</td>
<td>varchar(255)</td>
<td>NO</td>
<td></td>
<td>消息标题名称</td>
</tr>
<tr>
<td>show_type</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>展示端（1：乘客；2：司机）</td>
</tr>
<tr>
<td>sms_type</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>消息类型（1：营销；2：通知）</td>
</tr>
<tr>
<td>people_tag_id</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>人群id</td>
</tr>
<tr>
<td>sms_image</td>
<td>varchar(255)</td>
<td>NO</td>
<td></td>
<td>消息图片</td>
</tr>
<tr>
<td>app_template_id</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td>消息文案id</td>
</tr>
<tr>
<td>sms_url</td>
<td>varchar(255)</td>
<td>NO</td>
<td></td>
<td>链接地址</td>
</tr>
<tr>
<td>start_time</td>
<td>datetime</td>
<td>NO</td>
<td></td>
<td>生效时间</td>
</tr>
<tr>
<td>send_status</td>
<td>tinyint(1)</td>
<td>NO</td>
<td></td>
<td>推送状态（0：未推送；1：已推送）</td>
</tr>
<tr>
<td>status</td>
<td>tinyint(1)</td>
<td>NO</td>
<td></td>
<td>启用状态</td>
</tr>
<tr>
<td>operator_user</td>
<td>int(10)</td>
<td>YES</td>
<td></td>
<td>操作者</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_tima</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>更新时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 营销、通知短信发送记录
<a id=营销、通知短信发送记录> </a>
### 基本信息

**Path：** /tbl_sms_send_phone

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>sms_template_id</td>
<td>varchar(30)</td>
<td>NO</td>
<td></td>
<td>文案模板template_id</td>
</tr>
<tr>
<td>sms_type</td>
<td>tinyint(1)</td>
<td>NO</td>
<td></td>
<td>消息类型（1：营销；2：通知）</td>
</tr>
<tr>
<td>send_type</td>
<td>tinyint(1)</td>
<td>NO</td>
<td></td>
<td>发送类型（1：单人发送；2：批量发送）</td>
</tr>
<tr>
<td>phone_number</td>
<td>varchar(255)</td>
<td>NO</td>
<td></td>
<td>单人发送手机号</td>
</tr>
<tr>
<td>phone_file</td>
<td>varchar(120)</td>
<td>NO</td>
<td></td>
<td>批量发送文件名</td>
</tr>
<tr>
<td>send_people</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>1:乘客；2：司机</td>
</tr>
<tr>
<td>operator_user</td>
<td>int(10)</td>
<td>YES</td>
<td></td>
<td>操作者</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>更新时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 消息推送记录（php）
<a id=消息推送记录（php）> </a>
### 基本信息

**Path：** /tbl_push_app_message

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>yid</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>乘客、司机id,大屏设备号</td>
</tr>
<tr>
<td>accept_identity</td>
<td>tinyint(1)</td>
<td>NO</td>
<td></td>
<td>接收端（1：乘客；2：司机；4：大屏）</td>
</tr>
<tr>
<td>title</td>
<td>varchar(120)</td>
<td>NO</td>
<td></td>
<td>标题</td>
</tr>
<tr>
<td>content</td>
<td>varchar(1024)</td>
<td>NO</td>
<td></td>
<td>消息内容</td>
</tr>
<tr>
<td>send_time</td>
<td>datetime</td>
<td>NO</td>
<td></td>
<td>发送时间</td>
</tr>
<tr>
<td>status</td>
<td>tinyint(1)</td>
<td>NO</td>
<td></td>
<td>是否显示（0：不显示，1：显示）</td>
</tr>
<tr>
<td>push_type</td>
<td>tinyint(3)</td>
<td>NO</td>
<td></td>
<td>推送类型 （1：营销通知，2：系统通知，3：订单通知，4：支付通知）</td>
</tr>
<tr>
<td>sms_send_app_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>推送任务id</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 网约车平台公司基本信息
<a id=网约车平台公司基本信息> </a>
### 基本信息

**Path：** /tbl_base_info_company

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10)</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>company_name</td>
<td>varchar(256)</td>
<td>NO</td>
<td></td>
<td>公司名称</td>
</tr>
<tr>
<td>identifier</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>停用社会信用代码</td>
</tr>
<tr>
<td>business_scope</td>
<td>varchar(256)</td>
<td>NO</td>
<td></td>
<td>经营范围</td>
</tr>
<tr>
<td>contact_address</td>
<td>varchar(256)</td>
<td>NO</td>
<td></td>
<td>通信地址</td>
</tr>
<tr>
<td>economic_type</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>经营业户经济类型</td>
</tr>
<tr>
<td>reg_capital</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>注册资本</td>
</tr>
<tr>
<td>legal_name</td>
<td>varchar(256)</td>
<td>NO</td>
<td></td>
<td>法人代表姓名</td>
</tr>
<tr>
<td>legal_id</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>法人代表身份证号</td>
</tr>
<tr>
<td>legal_phone</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>法人代表电话</td>
</tr>
<tr>
<td>legal_photo</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>法人代表身份证扫描件文件编号</td>
</tr>
<tr>
<td>state</td>
<td>int(1)</td>
<td>NO</td>
<td></td>
<td>状态0有效，1失效</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>更新时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 网约车平台公司支付信息
<a id=网约车平台公司支付信息> </a>
### 基本信息

**Path：** /tbl_base_info_company_pay

**Method：** GET

**接口描述：**
undefined

### 请求参数

## 网约车平台公司经营许可证
<a id=网约车平台公司经营许可证> </a>
### 基本信息

**Path：** /tbl_base_info_company_permit

**Method：** GET

**接口描述：**
undefined

### 请求参数

## 网约车平台公司服务机构
<a id=网约车平台公司服务机构> </a>
### 基本信息

**Path：** /tbl_base_info_company_service

**Method：** GET

**接口描述：**
undefined

### 请求参数

## 通话记录表
<a id=通话记录表> </a>
### 基本信息

**Path：** /tbl_call_records

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>pk</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(16)</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>pool_key</td>
<td>varchar(64)</td>
<td>YES</td>
<td></td>
<td>对应的号池Key</td>
</tr>
<tr>
<td>sub_id</td>
<td>varchar(64)</td>
<td>YES</td>
<td></td>
<td>通话对应的三元组的绑定关系ID</td>
</tr>
<tr>
<td>call_id</td>
<td>varchar(64)</td>
<td>YES</td>
<td></td>
<td>唯一标识一通通话记录的ID</td>
</tr>
<tr>
<td>phone_no</td>
<td>varchar(64)</td>
<td>YES</td>
<td></td>
<td>AXB中的A号码</td>
</tr>
<tr>
<td>secret_no</td>
<td>varchar(64)</td>
<td>YES</td>
<td></td>
<td>AXB中的X号码</td>
</tr>
<tr>
<td>peer_no</td>
<td>varchar(64)</td>
<td>YES</td>
<td></td>
<td>AXB中的B号码或者N号码</td>
</tr>
<tr>
<td>call_type</td>
<td>varchar(64)</td>
<td>YES</td>
<td></td>
<td>呼叫类型<br data-tomark-pass="">0:主叫(phone_no打给peer_no)；1:被叫(peer_no打给phone_no)；2:短信发送；3:短信接收</td>
</tr>
<tr>
<td>call_time</td>
<td>datetime</td>
<td>YES</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>呼叫动作开始时间</td>
</tr>
<tr>
<td>ring_time</td>
<td>datetime</td>
<td>YES</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>对端手机振铃时间</td>
</tr>
<tr>
<td>start_time</td>
<td>datetime</td>
<td>YES</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>对端接听时间</td>
</tr>
<tr>
<td>release_time</td>
<td>datetime</td>
<td>YES</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>对端挂断时间，release_time - start_time 代表通话时长 如果结果为0,代表呼叫未接通</td>
</tr>
<tr>
<td>release_dir</td>
<td>varchar(4)</td>
<td>YES</td>
<td></td>
<td>通话释放方向</td>
</tr>
<tr>
<td>release_cause</td>
<td>int(4)</td>
<td>YES</td>
<td></td>
<td>释放原因<br data-tomark-pass="">1:未分配的号码<br data-tomark-pass="">2:无路由到指定的转接网<br data-tomark-pass="">3:无路由到目的地<br data-tomark-pass="">4:发送专用信息音<br data-tomark-pass="">16:正常的呼叫拆线<br data-tomark-pass="">17:用户忙<br data-tomark-pass="">18:用户未响应<br data-tomark-pass="">19:用户未应答<br data-tomark-pass="">20:用户缺席<br data-tomark-pass="">21:呼叫拒收<br data-tomark-pass="">22:号码改变<br data-tomark-pass="">27:目的地不可达<br data-tomark-pass="">28:无效的号码格式（地址不全）<br data-tomark-pass="">29:性能拒绝<br data-tomark-pass="">31:正常—未指定<br data-tomark-pass="">34: 无电路/通路可用<br data-tomark-pass="">42: 交换设备拥塞<br data-tomark-pass="">50:所请求的性能未预定<br data-tomark-pass="">53:CUG中限制去呼叫<br data-tomark-pass="">55: CUG中限制来呼叫<br data-tomark-pass="">57:承载能力无权<br data-tomark-pass="">58:承载能力目前不可用<br data-tomark-pass="">65:承载能力未实现<br data-tomark-pass="">69:所请求的性能未实现<br data-tomark-pass="">87:被叫用户不是CUG的成员<br data-tomark-pass="">88:不兼容的目的地<br data-tomark-pass="">90:不存在的CUG<br data-tomark-pass="">91:无效的转接网选择<br data-tomark-pass="">95:无效的消息，未指定<br data-tomark-pass="">97:消息类型不存在或未实现<br data-tomark-pass="">99:参数不存在或未实现<br data-tomark-pass="">102:定时器终了时恢复<br data-tomark-pass="">103:参数不存在或未实现—传递<br data-tomark-pass="">110:消息带有未被识别的参数—舍弃<br data-tomark-pass="">111:协议错误，未指定<br data-tomark-pass="">127:互通，未指定</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td></td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td></td>
</tr>
</tbody>
</table>


### 请求参数

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody">
               </tbody>
              </table>
            
## 车辆绑定信息变更表
<a id=车辆绑定信息变更表> </a>
### 基本信息

**Path：** /tbl_car_bind_change_record

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(11)</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>car_info_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>车辆ID</td>
</tr>
<tr>
<td>bind_tag</td>
<td>varchar(30)</td>
<td>NO</td>
<td></td>
<td>绑定类型</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>记录时间</td>
</tr>
<tr>
<td>bind_value</td>
<td>varchar(500)</td>
<td>NO</td>
<td></td>
<td>绑定内容</td>
</tr>
<tr>
<td>bind_type</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>0绑定,1解绑</td>
</tr>
<tr>
<td>operator_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>操作人ID</td>
</tr>
</tbody>
</table>


### 请求参数

## 车辆调度运力设置
<a id=车辆调度运力设置> </a>
### 基本信息

**Path：** /tbl_car_dispatch_capacity_set

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td>自增主键</td>
</tr>
<tr>
<td>city_code</td>
<td>varchar(70)</td>
<td>NO</td>
<td></td>
<td>城市编码</td>
</tr>
<tr>
<td>car_service_period</td>
<td>tinyint(1)</td>
<td>NO</td>
<td></td>
<td>车辆服务时段 1白天2夜晚</td>
</tr>
<tr>
<td>spare_driver_count</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>空闲司机数量</td>
</tr>
<tr>
<td>operator_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>操作人id</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>修改时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 车辆调度顺风单半径设置
<a id=车辆调度顺风单半径设置> </a>
### 基本信息

**Path：** /tbl_car_dispatch_direct_route_order_radius_set

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td>自增主键</td>
</tr>
<tr>
<td>city_code</td>
<td>varchar(70)</td>
<td>NO</td>
<td></td>
<td>城市编码</td>
</tr>
<tr>
<td>service_type_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>服务类型id</td>
</tr>
<tr>
<td>direct_route_order_type</td>
<td>tinyint(1)</td>
<td>NO</td>
<td></td>
<td>顺风单类型 1回家单 2接力单 3特殊时段预约单</td>
</tr>
<tr>
<td>direct_route_order_radius</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>顺风单半径（公里）</td>
</tr>
<tr>
<td>is_delete</td>
<td>tinyint(1)</td>
<td>NO</td>
<td></td>
<td>是否删除 0未删除 1已删除</td>
</tr>
<tr>
<td>operator_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>操作人id</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>修改时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 车辆调度派单间隔设置
<a id=车辆调度派单间隔设置> </a>
### 基本信息

**Path：** /tbl_car_dispatch_distribute_interval_set

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td>自增主键</td>
</tr>
<tr>
<td>city_code</td>
<td>varchar(70)</td>
<td>NO</td>
<td></td>
<td>城市编码</td>
</tr>
<tr>
<td>service_type_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>服务类型id</td>
</tr>
<tr>
<td>car_service_before_interval</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>用车服务前间隔（分钟）</td>
</tr>
<tr>
<td>car_service_after_interval</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>用车服务后间隔（分钟）</td>
</tr>
<tr>
<td>operator_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>操作人id</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>修改时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 车辆调度派单半径设置
<a id=车辆调度派单半径设置> </a>
### 基本信息

**Path：** /tbl_car_dispatch_distribute_radius_set

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td>自增主键</td>
</tr>
<tr>
<td>city_code</td>
<td>varchar(70)</td>
<td>NO</td>
<td></td>
<td>城市编码</td>
</tr>
<tr>
<td>service_type_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>服务类型id</td>
</tr>
<tr>
<td>min_radius</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>最小派单半径（公里）</td>
</tr>
<tr>
<td>min_radius_first_push_driver_count</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>最小派单半径首次推送司机数量</td>
</tr>
<tr>
<td>max_radius</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>最大派单半径（公里）</td>
</tr>
<tr>
<td>max_radius_first_push_driver_count</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>最大派单半径首次推送司机数量</td>
</tr>
<tr>
<td>operator_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>操作人id</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>修改时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 车辆调度派发设置
<a id=车辆调度派发设置> </a>
### 基本信息

**Path：** /tbl_car_dispatch_distribute_set

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td>自增主键</td>
</tr>
<tr>
<td>city_code</td>
<td>varchar(70)</td>
<td>NO</td>
<td></td>
<td>城市编码</td>
</tr>
<tr>
<td>is_force_distribute</td>
<td>tinyint(1)</td>
<td>NO</td>
<td></td>
<td>是否开启强派 0不开启 1开启</td>
</tr>
<tr>
<td>operator_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>操作人id</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td></td>
</tr>
</tbody>
</table>


### 请求参数

## 车辆调度特殊时段设置
<a id=车辆调度特殊时段设置> </a>
### 基本信息

**Path：** /tbl_car_dispatch_special_period_set

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td>自增主键</td>
</tr>
<tr>
<td>city_code</td>
<td>varchar(70)</td>
<td>NO</td>
<td></td>
<td>城市编码</td>
</tr>
<tr>
<td>service_type_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td></td>
</tr>
<tr>
<td>time_period</td>
<td>varchar(255)</td>
<td>NO</td>
<td></td>
<td>时段设置</td>
</tr>
<tr>
<td>is_delete</td>
<td>tinyint(1)</td>
<td>NO</td>
<td></td>
<td>是否删除 0未删除 1已删除</td>
</tr>
<tr>
<td>operator_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>操作人id</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td></td>
</tr>
</tbody>
</table>


### 请求参数

## 车辆调度时间阈值设置
<a id=车辆调度时间阈值设置> </a>
### 基本信息

**Path：** /tbl_car_dispatch_time_threshold_set

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td>自增主键</td>
</tr>
<tr>
<td>city_code</td>
<td>varchar(70)</td>
<td>NO</td>
<td></td>
<td>城市编码</td>
</tr>
<tr>
<td>service_type_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>服务类型id</td>
</tr>
<tr>
<td>time_threshold_type</td>
<td>tinyint(1)</td>
<td>NO</td>
<td></td>
<td>时间阈值类型 1开启立即用车派单逻辑 2预约用车待派订单开启强派模式</td>
</tr>
<tr>
<td>time_threshold</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>时间阈值（分钟）</td>
</tr>
<tr>
<td>operator_id</td>
<td>int(10)</td>
<td>YES</td>
<td></td>
<td>操作人id</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>修改时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 车辆级别列表
<a id=车辆级别列表> </a>
### 基本信息

**Path：** /tbl_car_level

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>label</td>
<td>varchar(30)</td>
<td>NO</td>
<td></td>
<td>车辆级别标签</td>
</tr>
<tr>
<td>icon</td>
<td>varchar(500)</td>
<td>NO</td>
<td></td>
<td>车型图标</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td></td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td></td>
</tr>
<tr>
<td>operator_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>操作人ID</td>
</tr>
<tr>
<td>enable</td>
<td>tinyint(4) unsigned</td>
<td>NO</td>
<td></td>
<td>状态:0未启用1启用</td>
</tr>
</tbody>
</table>


### 请求参数

## 渠道管理表
<a id=渠道管理表> </a>
### 基本信息

**Path：** /tbl_channel

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(11)</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>channel_name</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>渠道名称</td>
</tr>
<tr>
<td>channel_status</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>渠道开启暂停状态 1开启 0暂停</td>
</tr>
<tr>
<td>operator_id</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td>操作人id</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>更新时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 计费规则表
<a id=计费规则表> </a>
### 基本信息

**Path：** /tbl_charge_rule

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>city_code</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>城市编码</td>
</tr>
<tr>
<td>service_type_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>服务类型</td>
</tr>
<tr>
<td>channel_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>渠道名称</td>
</tr>
<tr>
<td>car_level_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>车辆级别</td>
</tr>
<tr>
<td>lowest_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>基础价</td>
</tr>
<tr>
<td>base_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>起步价</td>
</tr>
<tr>
<td>base_kilo</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>基础价格包含公里数</td>
</tr>
<tr>
<td>base_minutes</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>基础价格包含时长数(分钟)</td>
</tr>
<tr>
<td>per_kilo_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>超公里单价(每公里单价)</td>
</tr>
<tr>
<td>per_minute_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>超时间单价(每分钟单价)</td>
</tr>
<tr>
<td>beyond_start_kilo</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>远途起算公里</td>
</tr>
<tr>
<td>beyond_per_kilo_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>远途单价</td>
</tr>
<tr>
<td>night_start</td>
<td>time</td>
<td>YES</td>
<td></td>
<td>夜间时间段开始</td>
</tr>
<tr>
<td>night_end</td>
<td>time</td>
<td>YES</td>
<td></td>
<td>夜间时间段结束</td>
</tr>
<tr>
<td>night_per_kilo_price</td>
<td>double(10,2)</td>
<td>YES</td>
<td></td>
<td>夜间超公里加收单价</td>
</tr>
<tr>
<td>night_per_minute_price</td>
<td>double(10,2)</td>
<td>YES</td>
<td></td>
<td>夜间超时间加收单价</td>
</tr>
<tr>
<td>effective_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>生效时间</td>
</tr>
<tr>
<td>active_status</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td>生效状态 0已失效 1未失效</td>
</tr>
<tr>
<td>is_unuse</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td>是否不可用 0可用 1不可用</td>
</tr>
<tr>
<td>creator_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>创建人id</td>
</tr>
<tr>
<td>operator_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>操作人id</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>create_time</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>update_time</td>
</tr>
</tbody>
</table>


### 请求参数

## 计费规则时间段表
<a id=计费规则时间段表> </a>
### 基本信息

**Path：** /tbl_charge_rule_detail

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>字段名</td>
<td>数据类型</td>
<td>允许为空</td>
<td>PK</td>
<td>字段说明</td>
</tr>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>rule_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td></td>
</tr>
<tr>
<td>start</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>时间段开始</td>
</tr>
<tr>
<td>end</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>时间段结束</td>
</tr>
<tr>
<td>per_kilo_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>超公里单价</td>
</tr>
<tr>
<td>per_minute_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>超时间单价</td>
</tr>
<tr>
<td>is_delete</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>是否删除 0未删除 1已删除</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>修改时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 城市表
<a id=城市表> </a>
### 基本信息

**Path：** /tbl_city

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(11)</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>city_name</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>城市名称</td>
</tr>
<tr>
<td>city_code</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>城市编码</td>
</tr>
<tr>
<td>city_longitude_latitude</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>城市中心经纬度</td>
</tr>
<tr>
<td>order_risk_top</td>
<td>int(4)</td>
<td>NO</td>
<td></td>
<td>下单风险上限值</td>
</tr>
<tr>
<td>city_status</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>是否开通 0未开通 1开通</td>
</tr>
<tr>
<td>operator_id</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td>操作人id</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>更新时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 优惠券配置表
<a id=优惠券配置表> </a>
### 基本信息

**Path：** /tbl_coupon

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(11) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td>优惠券id</td>
</tr>
<tr>
<td>status</td>
<td>int(4) unsigned</td>
<td>NO</td>
<td></td>
<td>优惠券状态 0:禁用, 1:启用</td>
</tr>
<tr>
<td>coupon_name</td>
<td>varchar(20)</td>
<td>NO</td>
<td></td>
<td>优惠券名称</td>
</tr>
<tr>
<td>coupon_desc</td>
<td>varchar(160)</td>
<td>NO</td>
<td></td>
<td>优惠券描述</td>
</tr>
<tr>
<td>coupon_type</td>
<td>int(4) unsigned</td>
<td>NO</td>
<td></td>
<td>优惠券类型 1:现金券, 2:专项券-免费送车券, 3:专项券-免费还车券 4:折扣券</td>
</tr>
<tr>
<td>get_method</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>1,主动发放. 2,用户获取</td>
</tr>
<tr>
<td>minimum_amount</td>
<td>decimal(10,2)</td>
<td>NO</td>
<td></td>
<td>订单最低金额</td>
</tr>
<tr>
<td>reduction_amount</td>
<td>decimal(10,2)</td>
<td>NO</td>
<td></td>
<td>减免金额 仅现金券有此项</td>
</tr>
<tr>
<td>maximum_amount</td>
<td>decimal(10,2) unsigned</td>
<td>NO</td>
<td></td>
<td>最高抵扣金额</td>
</tr>
<tr>
<td>discount</td>
<td>decimal(4,2)</td>
<td>NO</td>
<td></td>
<td>折扣比例</td>
</tr>
<tr>
<td>effective_type</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>有效期类型 1：天数 ，2：时间段</td>
</tr>
<tr>
<td>effective_day</td>
<td>smallint(5) unsigned</td>
<td>NO</td>
<td></td>
<td>有效期天数</td>
</tr>
<tr>
<td>enable_time</td>
<td>datetime</td>
<td>NO</td>
<td></td>
<td>有效期开始时间</td>
</tr>
<tr>
<td>expire_time</td>
<td>datetime</td>
<td>NO</td>
<td></td>
<td>有效期结束时间</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>修改时间</td>
</tr>
<tr>
<td>create_user</td>
<td>varchar(20)</td>
<td>NO</td>
<td></td>
<td>创建用户</td>
</tr>
<tr>
<td>function_type</td>
<td>int(4)</td>
<td>NO</td>
<td></td>
<td>功能类型 1:市场活动, 2:订单赔付</td>
</tr>
<tr>
<td>condition_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>使用规则ID</td>
</tr>
</tbody>
</table>


### 请求参数

## 营销方案表
<a id=营销方案表> </a>
### 基本信息

**Path：** /tbl_coupon_activity

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>activity_no</td>
<td>varchar(30)</td>
<td>NO</td>
<td></td>
<td>方案编号</td>
</tr>
<tr>
<td>activity_name</td>
<td>varchar(30)</td>
<td>NO</td>
<td></td>
<td>方案名称</td>
</tr>
<tr>
<td>enable_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>活动开始时间</td>
</tr>
<tr>
<td>expire_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>过期时间</td>
</tr>
<tr>
<td>activity_type</td>
<td>tinyint(4)</td>
<td>NO</td>
<td></td>
<td>优惠形式</td>
</tr>
<tr>
<td>coupon_rule</td>
<td>varchar(250)</td>
<td>NO</td>
<td></td>
<td>领券规则</td>
</tr>
<tr>
<td>activity_desc</td>
<td>varchar(250)</td>
<td>NO</td>
<td></td>
<td>活动描述</td>
</tr>
<tr>
<td>get_times</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>领券次数</td>
</tr>
<tr>
<td>send_times</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>发送次数</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td></td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td></td>
</tr>
<tr>
<td>modify_by</td>
<td>varchar(30)</td>
<td>NO</td>
<td></td>
<td>最后变更人</td>
</tr>
<tr>
<td>status</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>状态 0 冻结 1 正常</td>
</tr>
</tbody>
</table>


### 请求参数

## 优惠券类型表
<a id=优惠券类型表> </a>
### 基本信息

**Path：** /tbl_coupon_class

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>mediumint(8) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>coupon_type</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>优惠券类型:1现金券,2折扣券</td>
</tr>
<tr>
<td>coupon_name</td>
<td>varchar(30)</td>
<td>NO</td>
<td></td>
<td>优惠券名称</td>
</tr>
<tr>
<td>reduction_amount</td>
<td>decimal(10,2)</td>
<td>NO</td>
<td></td>
<td>抵扣金额</td>
</tr>
<tr>
<td>discount</td>
<td>decimal(4,2)</td>
<td>NO</td>
<td></td>
<td>折扣比例(0~1)</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>更新时间</td>
</tr>
<tr>
<td>modify_by</td>
<td>varchar(30)</td>
<td>NO</td>
<td></td>
<td>最后修改人</td>
</tr>
<tr>
<td>is_pause</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>暂停:0否1是</td>
</tr>
</tbody>
</table>


### 请求参数

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody">
               </tbody>
              </table>
            
## 优惠券使用条件限制表
<a id=优惠券使用条件限制表> </a>
### 基本信息

**Path：** /tbl_coupon_conditions

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>coupon_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>优惠券ID</td>
</tr>
<tr>
<td>hour_set</td>
<td>varchar(80)</td>
<td>NO</td>
<td></td>
<td>小时集合</td>
</tr>
<tr>
<td>week_set</td>
<td>varchar(15)</td>
<td>NO</td>
<td></td>
<td>周集合</td>
</tr>
<tr>
<td>date_set</td>
<td>varchar(80)</td>
<td>NO</td>
<td></td>
<td>日期集合</td>
</tr>
<tr>
<td>city_set</td>
<td>varchar(1023)</td>
<td>NO</td>
<td></td>
<td>城市集合</td>
</tr>
<tr>
<td>car_set</td>
<td>varchar(60)</td>
<td>NO</td>
<td></td>
<td>车辆类型集合</td>
</tr>
<tr>
<td>service_set</td>
<td>varchar(30)</td>
<td>NO</td>
<td></td>
<td>服务集合</td>
</tr>
<tr>
<td>level_set</td>
<td>varchar(30)</td>
<td>YES</td>
<td></td>
<td></td>
</tr>
<tr>
<td>hour_raw</td>
<td>varchar(120)</td>
<td>NO</td>
<td></td>
<td>时段原始数据</td>
</tr>
<tr>
<td>date_raw</td>
<td>varchar(120)</td>
<td>NO</td>
<td></td>
<td>日期原始数据</td>
</tr>
</tbody>
</table>


### 请求参数

## 优惠券发送任务表
<a id=优惠券发送任务表> </a>
### 基本信息

**Path：** /tbl_coupon_task

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(11) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>coupon_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>优惠券ID</td>
</tr>
<tr>
<td>coupon_name</td>
<td>varchar(30)</td>
<td>NO</td>
<td></td>
<td>优惠券名称</td>
</tr>
<tr>
<td>number</td>
<td>smallint(5) unsigned</td>
<td>NO</td>
<td></td>
<td>发放数量</td>
</tr>
<tr>
<td>task_tag</td>
<td>varchar(30)</td>
<td>NO</td>
<td></td>
<td>任务标签,用于区分不同批次</td>
</tr>
<tr>
<td>people_tag_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>人群模板ID</td>
</tr>
<tr>
<td>task_target</td>
<td>varchar(1280)</td>
<td>NO</td>
<td></td>
<td>任务目标,最多100个手机号</td>
</tr>
<tr>
<td>app_tpl_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>app文案模板ID</td>
</tr>
<tr>
<td>sms_tpl_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>短信文案模板ID</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td></td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td></td>
</tr>
<tr>
<td>modify_by</td>
<td>varchar(30)</td>
<td>NO</td>
<td></td>
<td></td>
</tr>
<tr>
<td>task_status</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>任务状态:0未开始1进行中2完成</td>
</tr>
<tr>
<td>start_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td></td>
</tr>
<tr>
<td>is_cancel</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>是否终止:0否,1是</td>
</tr>
<tr>
<td>plan_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>计划发送时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 设备黑名单
<a id=设备黑名单> </a>
### 基本信息

**Path：** /tbl_device_blacklist

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>device_type</td>
<td>char(1)</td>
<td>NO</td>
<td></td>
<td>1 android 2 ios3 other</td>
</tr>
<tr>
<td>device_code</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>手机设备串码</td>
</tr>
<tr>
<td>last_login_time</td>
<td>timestamp</td>
<td>YES</td>
<td></td>
<td>最后一次登录时间</td>
</tr>
<tr>
<td>is_release</td>
<td>tinyint(11) unsigned</td>
<td>NO</td>
<td></td>
<td>1 解禁，0 未解禁</td>
</tr>
<tr>
<td>memo</td>
<td>varchar(500)</td>
<td>NO</td>
<td></td>
<td>备注</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>create</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>update</td>
</tr>
</tbody>
</table>


### 请求参数

## 字典表
<a id=字典表> </a>
### 基本信息

**Path：** /tbl_dictionary

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td>id</td>
</tr>
<tr>
<td>dic_parentid</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>父id</td>
</tr>
<tr>
<td>dic_type</td>
<td>varchar(100)</td>
<td>NO</td>
<td></td>
<td>类型</td>
</tr>
<tr>
<td>dic_name</td>
<td>varchar(50)</td>
<td>NO</td>
<td></td>
<td></td>
</tr>
<tr>
<td>dic_value</td>
<td>varchar(200)</td>
<td>NO</td>
<td></td>
<td>值</td>
</tr>
<tr>
<td>dic_desc</td>
<td>varchar(200)</td>
<td>NO</td>
<td></td>
<td>描述</td>
</tr>
<tr>
<td>dic_order</td>
<td>int(5) unsigned</td>
<td>NO</td>
<td></td>
<td>排序</td>
</tr>
<tr>
<td>dic_status</td>
<td>varchar(2)</td>
<td>NO</td>
<td></td>
<td></td>
</tr>
</tbody>
</table>


### 请求参数

## 司机顺风地址记录表
<a id=司机顺风地址记录表> </a>
### 基本信息

**Path：** /tbl_driver_address

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(11)</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>driver_id</td>
<td>int(11) unsigned</td>
<td>YES</td>
<td></td>
<td></td>
</tr>
<tr>
<td>address</td>
<td>varchar(120)</td>
<td>NO</td>
<td></td>
<td>详细地址</td>
</tr>
<tr>
<td>address_longitude</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>地址经度</td>
</tr>
<tr>
<td>address_latitude</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>地址纬度</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>编辑时间</td>
</tr>
<tr>
<td>tag</td>
<td>varchar(15)</td>
<td>NO</td>
<td></td>
<td>标签</td>
</tr>
<tr>
<td>is_default</td>
<td>tinyint(4)</td>
<td>NO</td>
<td></td>
<td>是否默认地址</td>
</tr>
</tbody>
</table>


### 请求参数

## 司机绑定信息变更表
<a id=司机绑定信息变更表> </a>
### 基本信息

**Path：** /tbl_driver_bind_change_record

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(11)</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>driver_info_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>司机ID</td>
</tr>
<tr>
<td>bind_tag</td>
<td>varchar(30)</td>
<td>NO</td>
<td></td>
<td>绑定类型</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>记录时间</td>
</tr>
<tr>
<td>bind_value</td>
<td>varchar(500)</td>
<td>NO</td>
<td></td>
<td>绑定内容</td>
</tr>
<tr>
<td>bind_type</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>0绑定,1解绑</td>
</tr>
<tr>
<td>operator_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>操作人ID</td>
</tr>
</tbody>
</table>


### 请求参数

## 司机信息表
<a id=司机信息表> </a>
### 基本信息

**Path：** /tbl_driver_info

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td></td>
</tr>
<tr>
<td>mobile_operator</td>
<td>varchar(255)</td>
<td>NO</td>
<td></td>
<td>手机运营商</td>
</tr>
<tr>
<td>company_logo</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>公司标识</td>
</tr>
<tr>
<td>administrative_code</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>注册行政地区代码</td>
</tr>
<tr>
<td>birthday</td>
<td>date</td>
<td>YES</td>
<td></td>
<td>驾驶员出生日期</td>
</tr>
<tr>
<td>country</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>国籍</td>
</tr>
<tr>
<td>national</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>驾驶员民族</td>
</tr>
<tr>
<td>driving_licence_number</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>驾驶证编号</td>
</tr>
<tr>
<td>marital_status</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>婚姻状况</td>
</tr>
<tr>
<td>foreign_language_ability</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>外语能力</td>
</tr>
<tr>
<td>app_version</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>使用APP版本号</td>
</tr>
<tr>
<td>map_type</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>使用地图类型</td>
</tr>
<tr>
<td>education_background</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>驾驶员学历</td>
</tr>
<tr>
<td>household_registration_authority</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>户口&nbsp;&nbsp; 登记机关名称</td>
</tr>
<tr>
<td>registered_permanent_residence_address</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>户口&nbsp;&nbsp; 住址</td>
</tr>
<tr>
<td>address</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>现居地址</td>
</tr>
<tr>
<td>address_longitude</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>现居地址经度</td>
</tr>
<tr>
<td>address_latitude</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>现居地址纬度</td>
</tr>
<tr>
<td>driver_img_file_number</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>驾驶员照片文件编号</td>
</tr>
<tr>
<td>driver_license</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>机动车驾驶员证</td>
</tr>
<tr>
<td>driver_license_scan_copy_number</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>机动车驾驶证扫描件文件编号</td>
</tr>
<tr>
<td>driving_type</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>准驾车型</td>
</tr>
<tr>
<td>first_get_driver_license_date</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>初次领取驾驶证日期</td>
</tr>
<tr>
<td>driver_license_validity_start</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>驾驶证有效期起</td>
</tr>
<tr>
<td>driver_license_validity_end</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>驾驶证有效期止</td>
</tr>
<tr>
<td>is_taxi_driver</td>
<td>int(11) unsigned</td>
<td>NO</td>
<td></td>
<td>是否巡游出租车驾驶员</td>
</tr>
<tr>
<td>network_reservation_taxi_driver_license_number</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>网络预约出租汽车驾驶员证号</td>
</tr>
<tr>
<td>network_reservation_taxi_driver_license_issuing_agencies</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>网络预约出租汽车驾驶员证发证机构</td>
</tr>
<tr>
<td>certificate_issuing_date</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>资格证发证日期</td>
</tr>
<tr>
<td>first_qualification_date</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>初次领取资格证日期</td>
</tr>
<tr>
<td>qualification_certificate_validity_start</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>资格证有效期起</td>
</tr>
<tr>
<td>qualification_certificate_validity_end</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>资格证有效期止</td>
</tr>
<tr>
<td>reported_date</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>报备日期</td>
</tr>
<tr>
<td>is_full_time_driver</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td>是否专职驾驶员</td>
</tr>
<tr>
<td>is_in_driver_blacklist</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td>是否在黑名单</td>
</tr>
<tr>
<td>service_type</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td>服务类型</td>
</tr>
<tr>
<td>company</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>驾驶员合同（或协议）签署公司</td>
</tr>
<tr>
<td>contract_start_date</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>合同开始时间</td>
</tr>
<tr>
<td>contract_end_date</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>合同结束时间</td>
</tr>
<tr>
<td>emergency_contact</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>紧急联系人</td>
</tr>
<tr>
<td>emergency_contact_phone_number</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>紧急联系人电话</td>
</tr>
<tr>
<td>emergency_contact_address</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>紧急联系人地址</td>
</tr>
<tr>
<td>training_courses</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>培训课名称</td>
</tr>
<tr>
<td>training_courses_date</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>培训课程日期</td>
</tr>
<tr>
<td>training_courses_start_date</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>培训开始日期</td>
</tr>
<tr>
<td>training_courses_end_date</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>培训结束日期</td>
</tr>
<tr>
<td>training_courses_time</td>
<td>int(11) unsigned</td>
<td>NO</td>
<td></td>
<td>培训时长</td>
</tr>
<tr>
<td>bank_name</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>开户行</td>
</tr>
<tr>
<td>bank_card_number</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>银行卡号</td>
</tr>
<tr>
<td>note</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>备注</td>
</tr>
<tr>
<td>qualification_certificate_img</td>
<td>varchar(256)</td>
<td>NO</td>
<td></td>
<td>从业资格证照片</td>
</tr>
<tr>
<td>other_img1</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>其他一</td>
</tr>
<tr>
<td>other_img2</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>其他二</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>修改时间</td>
</tr>
</tbody>
</table>
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(16) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>phone_number</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>司机手机号</td>
</tr>
<tr>
<td>driver_leader</td>
<td>int(11) unsigned</td>
<td>YES</td>
<td></td>
<td>司机主管</td>
</tr>
<tr>
<td>driver_name</td>
<td>varchar(16)</td>
<td>NO</td>
<td></td>
<td>司机姓名</td>
</tr>
<tr>
<td>register_time</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>注册时间</td>
</tr>
<tr>
<td>balance</td>
<td>decimal(10,2)</td>
<td>NO</td>
<td></td>
<td>余额</td>
</tr>
<tr>
<td>gender</td>
<td>int(2) unsigned</td>
<td>NO</td>
<td></td>
<td>性别</td>
</tr>
<tr>
<td>car_id</td>
<td>int(16) unsigned</td>
<td>YES</td>
<td></td>
<td>车辆id</td>
</tr>
<tr>
<td>is_following</td>
<td>int(1)</td>
<td>NO</td>
<td></td>
<td>是否是顺风单0否 1是</td>
</tr>
<tr>
<td>work_status</td>
<td>int(2) unsigned</td>
<td>NO</td>
<td></td>
<td>司机工作状态<br data-tomark-pass=""><br data-tomark-pass="">0：非出车状态，<br data-tomark-pass=""><br data-tomark-pass="">1：出车，未接订单，<br data-tomark-pass=""><br data-tomark-pass="">2：出车，接到订单,<br data-tomark-pass=""><br data-tomark-pass="">3：暂停接单</td>
</tr>
<tr>
<td>head_img</td>
<td>varchar(256)</td>
<td>NO</td>
<td></td>
<td>司机头像</td>
</tr>
<tr>
<td>city_code</td>
<td>varchar(8)</td>
<td>NO</td>
<td></td>
<td>城市代码</td>
</tr>
<tr>
<td>bind_time</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>绑定时间</td>
</tr>
<tr>
<td>use_status</td>
<td>int(2) unsigned</td>
<td>NO</td>
<td></td>
<td>启用停用状态，0：停用，1：启用</td>
</tr>
<tr>
<td>cs_work_status</td>
<td>int(2) unsigned</td>
<td>NO</td>
<td></td>
<td>车机工作状态<br data-tomark-pass=""><br data-tomark-pass="">0：车机未登录登录<br data-tomark-pass=""><br data-tomark-pass="">1：车机登录<br data-tomark-pass=""><br data-tomark-pass="">2：车机听单<br data-tomark-pass=""><br data-tomark-pass="">3：车机暂停听单<br data-tomark-pass=""><br data-tomark-pass="">4：车机收车<br data-tomark-pass=""><br data-tomark-pass=""><br data-tomark-pass=""></td>
</tr>
<tr>
<td>sign_status</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>1：已签约，0：已解约</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>修改时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 司机驾驶证信息
<a id=司机驾驶证信息> </a>
### 基本信息

**Path：** /tbl_driver_licence_info

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(16) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td>审核记录id</td>
</tr>
<tr>
<td>driver_id</td>
<td>int(16)</td>
<td>NO</td>
<td></td>
<td>司机id</td>
</tr>
<tr>
<td>main_driving_license</td>
<td>varchar(256)</td>
<td>NO</td>
<td></td>
<td>驾照主页照片地址</td>
</tr>
<tr>
<td>vice_driving_license</td>
<td>varchar(256)</td>
<td>NO</td>
<td></td>
<td>驾照副页照片地址</td>
</tr>
<tr>
<td>all_driving_license</td>
<td>varchar(256)</td>
<td>NO</td>
<td></td>
<td>驾照正副页照片地址</td>
</tr>
<tr>
<td>group_driving_license</td>
<td>varchar(256)</td>
<td>NO</td>
<td></td>
<td>手持驾照照片地址</td>
</tr>
<tr>
<td>identity_card_id</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>身份证</td>
</tr>
<tr>
<td>main_idcard_license</td>
<td>varchar(256)</td>
<td>NO</td>
<td></td>
<td>身份证正面照</td>
</tr>
<tr>
<td>vice_idcard_license</td>
<td>varchar(256)</td>
<td>NO</td>
<td></td>
<td>身份证副页照片地址</td>
</tr>
<tr>
<td>group_idcard_license</td>
<td>varchar(256)</td>
<td>NO</td>
<td></td>
<td>手持身份证照片</td>
</tr>
<tr>
<td>plate_number</td>
<td>varchar(16)</td>
<td>NO</td>
<td></td>
<td>车牌号</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>YES</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>修改时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 驾驶员荣誉信息表
<a id=驾驶员荣誉信息表> </a>
### 基本信息

**Path：** /tbl_driver_rate

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10)</td>
<td>NO</td>
<td>auto_increment</td>
<td>自增主键</td>
</tr>
<tr>
<td>driver_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>司机ID</td>
</tr>
<tr>
<td>grade</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>等级</td>
</tr>
<tr>
<td>test_date</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>考核日期</td>
</tr>
<tr>
<td>test_department</td>
<td>varchar(255)</td>
<td>NO</td>
<td></td>
<td>考核机构</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>修改时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 司机工作时间
<a id=司机工作时间> </a>
### 基本信息

**Path：** /tbl_driver_work_time

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>driver_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>司机id</td>
</tr>
<tr>
<td>work_start</td>
<td>datetime</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>工作开始时间</td>
</tr>
<tr>
<td>work_end</td>
<td>datetime</td>
<td>NO</td>
<td></td>
<td>工作结束时间</td>
</tr>
<tr>
<td>work_duration</td>
<td>decimal(8,2)</td>
<td>NO</td>
<td></td>
<td>此次工作时长</td>
</tr>
<tr>
<td>work_day</td>
<td>date</td>
<td>NO</td>
<td></td>
<td>工作日</td>
</tr>
</tbody>
</table>


### 请求参数

## 动态调价城市表
<a id=动态调价城市表> </a>
### 基本信息

**Path：** /tbl_dynamic_discount_city

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td>自增主键</td>
</tr>
<tr>
<td>dynamic_discount_rule_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>动态折扣关联id</td>
</tr>
<tr>
<td>city_code</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>城市编码</td>
</tr>
<tr>
<td>is_delete</td>
<td>int(1)</td>
<td>NO</td>
<td></td>
<td>是否删除 0不删除 1删除</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>修改时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 动态折扣信息表
<a id=动态折扣信息表> </a>
### 基本信息

**Path：** /tbl_dynamic_discount_info

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td>自增主键</td>
</tr>
<tr>
<td>dynamic_discount_rule_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>动态折扣关联id</td>
</tr>
<tr>
<td>km</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>里程</td>
</tr>
<tr>
<td>discount</td>
<td>double(3,2)</td>
<td>NO</td>
<td></td>
<td>折扣</td>
</tr>
<tr>
<td>is_delete</td>
<td>int(1)</td>
<td>NO</td>
<td></td>
<td>是否删除 0不删除 1删除</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>修改时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 动态折扣规则表
<a id=动态折扣规则表> </a>
### 基本信息

**Path：** /tbl_dynamic_discount_rule

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td>自增主键</td>
</tr>
<tr>
<td>service_type</td>
<td>varchar(255)</td>
<td>NO</td>
<td></td>
<td>服务类型</td>
</tr>
<tr>
<td>car_level</td>
<td>varchar(255)</td>
<td>NO</td>
<td></td>
<td>车辆级别</td>
</tr>
<tr>
<td>time_set</td>
<td>varchar(255)</td>
<td>NO</td>
<td></td>
<td>时段设置</td>
</tr>
<tr>
<td>date_type</td>
<td>int(1)</td>
<td>NO</td>
<td></td>
<td>日期类型 1星期 2特殊日期</td>
</tr>
<tr>
<td>week_set</td>
<td>varchar(255)</td>
<td>NO</td>
<td></td>
<td>星期设置</td>
</tr>
<tr>
<td>special_date_set</td>
<td>varchar(255)</td>
<td>NO</td>
<td></td>
<td>特殊日期设置</td>
</tr>
<tr>
<td>discount_max_price</td>
<td>double(8,2)</td>
<td>NO</td>
<td></td>
<td>折扣封顶金额</td>
</tr>
<tr>
<td>valid_start_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>生效开始时间</td>
</tr>
<tr>
<td>valid_end_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>生效结束时间</td>
</tr>
<tr>
<td>is_unuse</td>
<td>int(1)</td>
<td>NO</td>
<td></td>
<td>是否不可用 0可用 1不可用</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>修改时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 客户的订单评价表
<a id=客户的订单评价表> </a>
### 基本信息

**Path：** /tbl_evaluate_driver

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td>自增主键</td>
</tr>
<tr>
<td>grade</td>
<td>int(2) unsigned</td>
<td>NO</td>
<td></td>
<td>分数</td>
</tr>
<tr>
<td>content</td>
<td>varchar(500)</td>
<td>NO</td>
<td></td>
<td>评价内容</td>
</tr>
<tr>
<td>order_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>订单ID</td>
</tr>
<tr>
<td>passenger_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>乘客ID</td>
</tr>
<tr>
<td>driver_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>司机ID</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>修改时间</td>
</tr>
</tbody>
</table>


### 请求参数

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody">
               </tbody>
              </table>
            
## 用户反馈记录表
<a id=用户反馈记录表> </a>
### 基本信息

**Path：** /tbl_feedback

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>user_id</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td></td>
</tr>
<tr>
<td>user_name</td>
<td>varchar(100)</td>
<td>YES</td>
<td></td>
<td></td>
</tr>
<tr>
<td>phone</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td></td>
</tr>
<tr>
<td>terminal</td>
<td>char(255)</td>
<td>NO</td>
<td></td>
<td>端 1:乘客 2,司机 3,车机 4,大屏</td>
</tr>
<tr>
<td>category</td>
<td>char(255)</td>
<td>NO</td>
<td></td>
<td>问题类型</td>
</tr>
<tr>
<td>content</td>
<td>varchar(255)</td>
<td>YES</td>
<td></td>
<td>反馈内容</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td></td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td></td>
</tr>
</tbody>
</table>


### 请求参数

## 围栏管理
<a id=围栏管理> </a>
### 基本信息

**Path：** /tbl_fence_info

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(11) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>gid</td>
<td>varchar(70)</td>
<td>NO</td>
<td></td>
<td>高德ID</td>
</tr>
<tr>
<td>city_code</td>
<td>varchar(70)</td>
<td>NO</td>
<td></td>
<td>城市编码</td>
</tr>
<tr>
<td>fence_name</td>
<td>varchar(70)</td>
<td>NO</td>
<td></td>
<td>围栏名称</td>
</tr>
<tr>
<td>valid_start_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>生效开始时间</td>
</tr>
<tr>
<td>valid_end_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>生效结束时间</td>
</tr>
<tr>
<td>is_deny</td>
<td>tinyint(1)</td>
<td>NO</td>
<td></td>
<td>是否禁用 0未禁用 1已禁用</td>
</tr>
<tr>
<td>is_delete</td>
<td>tinyint(1)</td>
<td>NO</td>
<td></td>
<td>是否删除 0未删除 1已删除</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>修改时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 用户航班号
<a id=用户航班号> </a>
### 基本信息

**Path：** /tbl_flight_number

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(11) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>flight_number</td>
<td>varchar(30)</td>
<td>YES</td>
<td></td>
<td>航班号</td>
</tr>
<tr>
<td>flight_date</td>
<td>date</td>
<td>NO</td>
<td></td>
<td>航班日期</td>
</tr>
<tr>
<td>passenger_info_id</td>
<td>int(11) unsigned</td>
<td>NO</td>
<td></td>
<td></td>
</tr>
<tr>
<td>start_code</td>
<td>char(3)</td>
<td>YES</td>
<td></td>
<td>起点code</td>
</tr>
<tr>
<td>end_code</td>
<td>char(3)</td>
<td>YES</td>
<td></td>
<td>终点code</td>
</tr>
<tr>
<td>is_subscribe</td>
<td>tinyint(2) unsigned</td>
<td>NO</td>
<td></td>
<td>是否订阅：1订阅，0取消订阅</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>创建记录日期</td>
</tr>
</tbody>
</table>


### 请求参数

## 乘客大屏登录状态
<a id=乘客大屏登录状态> </a>
### 基本信息

**Path：** /tbl_large_screen_passenger

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(16)</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>passenger_info_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>乘客id</td>
</tr>
<tr>
<td>device_code</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>设备号</td>
</tr>
<tr>
<td>login_time</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td></td>
</tr>
<tr>
<td>logout_time</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td></td>
</tr>
<tr>
<td>login_status</td>
<td>int(2)</td>
<td>YES</td>
<td></td>
<td>登录状态：1：登录，2：退出登录</td>
</tr>
<tr>
<td>repair_time</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td></td>
</tr>
</tbody>
</table>


### 请求参数

## 订单表
<a id=订单表> </a>
### 基本信息

**Path：** /tbl_order

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>~~~~id</td>
<td>int(10)</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>order_number</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>订单号</td>
</tr>
<tr>
<td>passenger_info_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>乘客id</td>
</tr>
<tr>
<td>passenger_phone</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>乘客电话</td>
</tr>
<tr>
<td>device_code</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>乘客设备号</td>
</tr>
<tr>
<td>driver_id</td>
<td>int(10) unsigned</td>
<td>YES</td>
<td></td>
<td>司机id</td>
</tr>
<tr>
<td>driver_status</td>
<td>int(2) unsigned</td>
<td>YES</td>
<td></td>
<td>司机状态&nbsp;&nbsp;<br data-tomark-pass="">0：没有司机接单&nbsp;&nbsp;<br data-tomark-pass="">1：司机接单&nbsp;<br data-tomark-pass="">2.&nbsp; 去接乘客<br data-tomark-pass="">3：司机到达上车点&nbsp;&nbsp;<br data-tomark-pass="">4：开始行程&nbsp;&nbsp;<br data-tomark-pass="">5：结束行程&nbsp;<br data-tomark-pass="">6：发起收款&nbsp;<br data-tomark-pass="">7：取消</td>
</tr>
<tr>
<td>driver_phone</td>
<td>varchar(64)</td>
<td>YES</td>
<td></td>
<td>司机电话</td>
</tr>
<tr>
<td>car_id</td>
<td>int(10) unsigned</td>
<td>YES</td>
<td></td>
<td>车辆id</td>
</tr>
<tr>
<td>plate_number</td>
<td>varchar(16)</td>
<td>YES</td>
<td></td>
<td>车牌号</td>
</tr>
<tr>
<td>user_longitude</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>用户位置经度</td>
</tr>
<tr>
<td>user_latitude</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>用户位置纬度</td>
</tr>
<tr>
<td>start_longitude</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>乘客下单起点经度</td>
</tr>
<tr>
<td>start_latitude</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>乘客下单起点纬度</td>
</tr>
<tr>
<td>start_address</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>起点名称</td>
</tr>
<tr>
<td>end_address</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>终点地址名称</td>
</tr>
<tr>
<td>start_time</td>
<td>timestamp</td>
<td>YES</td>
<td></td>
<td>乘客下单时间</td>
</tr>
<tr>
<td>order_start_time</td>
<td>timestamp</td>
<td>YES</td>
<td></td>
<td>订单开始时间</td>
</tr>
<tr>
<td>end_longitude</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>乘客下单终点经度</td>
</tr>
<tr>
<td>end_latitude</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>乘客下单终点纬度</td>
</tr>
<tr>
<td>driver_grab_time</td>
<td>timestamp</td>
<td>YES</td>
<td></td>
<td>司机抢单时间</td>
</tr>
<tr>
<td>driver_start_time</td>
<td>timestamp</td>
<td>YES</td>
<td></td>
<td>司机去接乘客出发时间</td>
</tr>
<tr>
<td>driver_arrived_time</td>
<td>timestamp</td>
<td>YES</td>
<td></td>
<td>司机到达时间</td>
</tr>
<tr>
<td>pick_up_passenger_longitude</td>
<td>varchar(32)</td>
<td>YES</td>
<td></td>
<td>去接乘客经度</td>
</tr>
<tr>
<td>pick_up_passenger_latitude</td>
<td>varchar(32)</td>
<td>YES</td>
<td></td>
<td>去接乘客纬度</td>
</tr>
<tr>
<td>pick_up_passenger_address</td>
<td>varchar(300)</td>
<td>YES</td>
<td></td>
<td>去接乘客地点</td>
</tr>
<tr>
<td>receive_passenger_time</td>
<td>timestamp</td>
<td>YES</td>
<td></td>
<td>接到乘客时间</td>
</tr>
<tr>
<td>receive_passenger_longitude</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>接到乘客经度</td>
</tr>
<tr>
<td>receive_passenger_latitude</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>接到乘客纬度</td>
</tr>
<tr>
<td>passenger_getoff_time</td>
<td>timestamp</td>
<td>YES</td>
<td></td>
<td>乘客下车时间</td>
</tr>
<tr>
<td>passenger_getoff_longitude</td>
<td>varchar(32)</td>
<td>YES</td>
<td></td>
<td>乘客下车经度</td>
</tr>
<tr>
<td>passenger_getoff_latitude</td>
<td>varchar(32)</td>
<td>YES</td>
<td></td>
<td>乘客下车纬度</td>
</tr>
<tr>
<td>other_name</td>
<td>varchar(16)</td>
<td>YES</td>
<td></td>
<td>他人姓名 （乘车人）</td>
</tr>
<tr>
<td>other_phone</td>
<td>varchar(64)</td>
<td>YES</td>
<td></td>
<td>他人电话　(乘车人）</td>
</tr>
<tr>
<td>order_type</td>
<td>int(2) unsigned</td>
<td>YES</td>
<td></td>
<td>订单类型：1：自己叫车，2：他人叫车</td>
</tr>
<tr>
<td>service_type</td>
<td>int(2) unsigned</td>
<td>NO</td>
<td></td>
<td>叫车订单类型，<br data-tomark-pass="">1：实时订单，<br data-tomark-pass="">2：预约订单，<br data-tomark-pass="">3：接机单，<br data-tomark-pass="">4：送机单，<br data-tomark-pass="">5：日租，<br data-tomark-pass="">6：半日租</td>
</tr>
<tr>
<td>order_channel</td>
<td>int(2) unsigned</td>
<td>NO</td>
<td></td>
<td>订单渠道<br data-tomark-pass="">1.自有订单<br data-tomark-pass="">2.高德<br data-tomark-pass="">3.飞猪</td>
</tr>
<tr>
<td>status</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>订单状态 0: 订单预估 1：订单开始 2：司机接单 3：去接乘客 4：司机到达乘客起点 5：乘客上车，司机开始行程</td>
</tr>
<tr>
<td>6：到达目的地，行程结束，未支付 7：发起收款 8: 支付完成</td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td>transaction_id</td>
<td>varchar(32)</td>
<td>YES</td>
<td></td>
<td>商户交易id</td>
</tr>
<tr>
<td>mapping_id</td>
<td>varchar(64)</td>
<td>YES</td>
<td></td>
<td>关联id</td>
</tr>
<tr>
<td>mapping_number</td>
<td>varchar(32)</td>
<td>YES</td>
<td></td>
<td>关联号码</td>
</tr>
<tr>
<td>merchant_id</td>
<td>varchar(32)</td>
<td>YES</td>
<td></td>
<td>商户id</td>
</tr>
<tr>
<td>is_evaluate</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>乘客是否评价，0：未评价，1：已评价</td>
</tr>
<tr>
<td>invoice_type</td>
<td>int(2) unsigned</td>
<td>NO</td>
<td></td>
<td>发票状态：<br data-tomark-pass="">1：未开票，<br data-tomark-pass="">2：申请开票，<br data-tomark-pass="">3：开票中，<br data-tomark-pass="">4：已开票,<br data-tomark-pass="">5：退回,</td>
</tr>
<tr>
<td>is_annotate</td>
<td>int(2) unsigned</td>
<td>NO</td>
<td></td>
<td>通知客服状态<br data-tomark-pass="">0，未通知&nbsp;<br data-tomark-pass="">1,&nbsp; 已通知</td>
</tr>
<tr>
<td>source</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>设备来源<br data-tomark-pass="">1: ios<br data-tomark-pass="">2:android<br data-tomark-pass="">3.other</td>
</tr>
<tr>
<td>use_coupon</td>
<td>int(2) unsigned</td>
<td>NO</td>
<td></td>
<td>是否使用优惠券<br data-tomark-pass="">0:未使用&nbsp; 1:使用</td>
</tr>
<tr>
<td>cancel_order_type</td>
<td>int(2) unsigned</td>
<td>YES</td>
<td></td>
<td>取消原因类型id</td>
</tr>
<tr>
<td>pay_type</td>
<td>int(1)</td>
<td>YES</td>
<td></td>
<td>1:余额<br data-tomark-pass="">2.微信<br data-tomark-pass="">3.支付宝</td>
</tr>
<tr>
<td>is_paid</td>
<td>int(2) unsigned</td>
<td>NO</td>
<td></td>
<td>是否已支付 0：未支付&nbsp; 1：已支付</td>
</tr>
<tr>
<td>is_cancel</td>
<td>int(2) unsigned</td>
<td>NO</td>
<td></td>
<td>是否取消&nbsp; 0：未取消&nbsp;&nbsp; 1：已取消</td>
</tr>
<tr>
<td>is_adjust</td>
<td>int(2) unsigned</td>
<td>NO</td>
<td></td>
<td>调帐状态&nbsp; 0：未调帐&nbsp; 1:调账中 2.调账完毕</td>
</tr>
<tr>
<td>is_dissent</td>
<td>int(2) unsigned</td>
<td>NO</td>
<td></td>
<td>是否疑义订单 0：否&nbsp; 1：是</td>
</tr>
<tr>
<td>is_manual</td>
<td>int(1)</td>
<td>NO</td>
<td></td>
<td>是否人工派单0 否 1是</td>
</tr>
<tr>
<td>is_following</td>
<td>int(1)</td>
<td>NO</td>
<td></td>
<td>是否是顺风单0否 1是</td>
</tr>
<tr>
<td>is_fake_success</td>
<td>int(1)</td>
<td>NO</td>
<td></td>
<td>是否是假成功单0 否 1是</td>
</tr>
<tr>
<td>memo</td>
<td>varchar(500)</td>
<td>NO</td>
<td></td>
<td>备忘录</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>create_time</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>update_time</td>
</tr>
</tbody>
</table>


### 请求参数

## 订单调帐
<a id=订单调帐> </a>
### 基本信息

**Path：** /tbl_order_adjust_record

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td>ID</td>
</tr>
<tr>
<td>order_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>订单id</td>
</tr>
<tr>
<td>doubt_id</td>
<td>int(10) unsigned</td>
<td>YES</td>
<td></td>
<td>疑义订单id</td>
</tr>
<tr>
<td>adjust_account_type</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>调账类型1,充值 2.扣款</td>
</tr>
<tr>
<td>charge_number</td>
<td>varchar(32)</td>
<td>YES</td>
<td></td>
<td>充值</td>
</tr>
<tr>
<td>old_cost</td>
<td>decimal(10,2)</td>
<td>NO</td>
<td></td>
<td>调账前金额</td>
</tr>
<tr>
<td>new_cost</td>
<td>decimal(10,2)</td>
<td>NO</td>
<td></td>
<td>调账后金额</td>
</tr>
<tr>
<td>reason_type</td>
<td>int(10) unsigned</td>
<td>YES</td>
<td></td>
<td>调账原因id</td>
</tr>
<tr>
<td>reason_text</td>
<td>varchar(500)</td>
<td>YES</td>
<td></td>
<td>自定义调账原因</td>
</tr>
<tr>
<td>solution</td>
<td>varchar(500)</td>
<td>YES</td>
<td></td>
<td>处理方案</td>
</tr>
<tr>
<td>operator</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>操作人</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>create_time</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>update_time</td>
</tr>
</tbody>
</table>


### 请求参数

## 订单取消原因
<a id=订单取消原因> </a>
### 基本信息

**Path：** /tbl_order_cancel_record

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10)</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>order_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>订单id</td>
</tr>
<tr>
<td>is_charge</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>乘客是否有责0无责，1有责</td>
</tr>
<tr>
<td>cancel_cost</td>
<td>double(10,0)</td>
<td>NO</td>
<td></td>
<td>取消费</td>
</tr>
<tr>
<td>reason_type</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>取消原因类型 1 2 3 4</td>
</tr>
<tr>
<td>reason_text</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>其他原因</td>
</tr>
<tr>
<td>operator</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>操作人</td>
</tr>
<tr>
<td>operator_type</td>
<td>int(1)</td>
<td>NO</td>
<td></td>
<td>操作人类型1:客户自行取消 2:客服取消</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>更新时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 调帐审核
<a id=调帐审核> </a>
### 基本信息

**Path：** /tbl_order_doubt

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>order_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>订单id</td>
</tr>
<tr>
<td>appeal_number</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>申诉单号</td>
</tr>
<tr>
<td>adjust_type</td>
<td>int(10) unsigned</td>
<td>YES</td>
<td></td>
<td>调账类型 1充值 2扣款 3发优惠券</td>
</tr>
<tr>
<td>adjust_content</td>
<td>varchar(200)</td>
<td>NO</td>
<td></td>
<td>调账内容 充值</td>
</tr>
<tr>
<td>reason_type</td>
<td>int(10) unsigned</td>
<td>YES</td>
<td></td>
<td>疑义原因类型 1=&gt;'提前计费', 2=&gt;'司要绕路', 3=&gt;'不明费用', 4=&gt;'其他问题',</td>
</tr>
<tr>
<td>reason_text</td>
<td>varchar(300)</td>
<td>YES</td>
<td></td>
<td>自定义其他疑义原因</td>
</tr>
<tr>
<td>old_cost</td>
<td>decimal(10,2)</td>
<td>YES</td>
<td></td>
<td>调账前金额</td>
</tr>
<tr>
<td>now_cost</td>
<td>decimal(10,2)</td>
<td>YES</td>
<td></td>
<td>调账后金额</td>
</tr>
<tr>
<td>status</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>1待处理 2待审核 3已审核 4已完成 5已撤销</td>
</tr>
<tr>
<td>handle_type</td>
<td>int(10) unsigned</td>
<td>YES</td>
<td></td>
<td>处理类型 1充值 2扣款 3发优惠券</td>
</tr>
<tr>
<td>solution</td>
<td>varchar(200)</td>
<td>NO</td>
<td></td>
<td>处理方案</td>
</tr>
<tr>
<td>operators</td>
<td>varchar(50)</td>
<td>NO</td>
<td></td>
<td>操作人 （多人操作全记录)</td>
</tr>
<tr>
<td>operate_time</td>
<td>timestamp</td>
<td>YES</td>
<td></td>
<td>操作时间</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>提交时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>YES</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>更新时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 订单支付表
<a id=订单支付表> </a>
### 基本信息

**Path：** /tbl_order_payment

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>order_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>订单id</td>
</tr>
<tr>
<td>pay_type</td>
<td>int(2) unsigned</td>
<td>NO</td>
<td></td>
<td>支付类型：1账户余额，2微信，3支付宝</td>
</tr>
<tr>
<td>total_price</td>
<td>double(10,2) unsigned</td>
<td>NO</td>
<td></td>
<td>总金额</td>
</tr>
<tr>
<td>balance_price</td>
<td>double(10,2) unsigned</td>
<td>NO</td>
<td></td>
<td>余额支付金额</td>
</tr>
<tr>
<td>wechat_price</td>
<td>double(10,2) unsigned</td>
<td>NO</td>
<td></td>
<td>微信支付金额</td>
</tr>
<tr>
<td>alipay_price</td>
<td>double(10,2) unsigned</td>
<td>NO</td>
<td></td>
<td>支付宝金额</td>
</tr>
<tr>
<td>user_coupon_id</td>
<td>int(11) unsigned</td>
<td>NO</td>
<td></td>
<td>用户获得优惠券id,此时不是优惠券id，是用户优惠券关联id</td>
</tr>
<tr>
<td>coupon_reduce_price</td>
<td>double(10,2) unsigned</td>
<td>NO</td>
<td></td>
<td>优惠券减免金额</td>
</tr>
<tr>
<td>paid_price</td>
<td>double(10,2) unsigned</td>
<td>NO</td>
<td></td>
<td>已支付金额</td>
</tr>
<tr>
<td>remain_price</td>
<td>double(10,2) unsigned</td>
<td>NO</td>
<td></td>
<td>剩余支付的金额</td>
</tr>
<tr>
<td>tail_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>尾款价格</td>
</tr>
<tr>
<td>replenish_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>补扣价格</td>
</tr>
<tr>
<td>pay_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>支付时间</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>YES</td>
<td>on update CURRENT_TIMESTAMP</td>
<td></td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>YES</td>
<td>on update CURRENT_TIMESTAMP</td>
<td></td>
</tr>
</tbody>
</table>


### 请求参数

## 订单改派
<a id=订单改派> </a>
### 基本信息

**Path：** /tbl_order_reassignment_record

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>order_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>订单Id</td>
</tr>
<tr>
<td>driver_id_before</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>原司机Id</td>
</tr>
<tr>
<td>driver_name_before</td>
<td>varchar(100)</td>
<td>NO</td>
<td></td>
<td>原司机姓名</td>
</tr>
<tr>
<td>driver_id_now</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>当前司机ID</td>
</tr>
<tr>
<td>driver_name_now</td>
<td>varchar(100)</td>
<td>NO</td>
<td></td>
<td>当前司机name</td>
</tr>
<tr>
<td>operator</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>操作者</td>
</tr>
<tr>
<td>reason_type</td>
<td>int(64)</td>
<td>NO</td>
<td></td>
<td>改派原因</td>
</tr>
<tr>
<td>reason_text</td>
<td>varchar(200)</td>
<td>YES</td>
<td></td>
<td>改派内容</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td></td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td></td>
</tr>
</tbody>
</table>


### 请求参数

## 订单计费规则镜像表
<a id=订单计费规则镜像表> </a>
### 基本信息

**Path：** /tbl_order_rule_mirror

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>order_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>订单_id</td>
</tr>
<tr>
<td>rule_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>计价规则id</td>
</tr>
<tr>
<td>rule</td>
<td>text</td>
<td>NO</td>
<td></td>
<td>规则镜像的json</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td></td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td></td>
</tr>
</tbody>
</table>


### 请求参数

## 计费明细表
<a id=计费明细表> </a>
### 基本信息

**Path：** /tbl_order_rule_price

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th></th>
<th></th>
<th></th>
<th></th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>字段名</td>
<td>数据类型</td>
<td>允许为空</td>
<td>PK</td>
<td>字段说明</td>
</tr>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>order_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>订单id</td>
</tr>
<tr>
<td>category</td>
<td>varchar(1)</td>
<td>NO</td>
<td></td>
<td>价格类型：0预估，1实际</td>
</tr>
<tr>
<td>total_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>总价</td>
</tr>
<tr>
<td>total_distance</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>总距离（公里）</td>
</tr>
<tr>
<td>total_time</td>
<td>double(10,0)</td>
<td>NO</td>
<td></td>
<td>总时间（分钟）</td>
</tr>
<tr>
<td>city_code</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>城市编码</td>
</tr>
<tr>
<td>city_name</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>城市名称</td>
</tr>
<tr>
<td>service_type_id</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>服务类型id</td>
</tr>
<tr>
<td>service_type_name</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>服务类型名称</td>
</tr>
<tr>
<td>channel_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>渠道id</td>
</tr>
<tr>
<td>channel_name</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>渠道名称</td>
</tr>
<tr>
<td>car_level_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>车辆级别id</td>
</tr>
<tr>
<td>car_level_name</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>车辆级别名称</td>
</tr>
<tr>
<td>base_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>基础价格</td>
</tr>
<tr>
<td>base_kilo</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>基础价格包含公里数</td>
</tr>
<tr>
<td>base_minute</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>基础价格包含时长数（分钟）</td>
</tr>
<tr>
<td>lowest_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>最低消费</td>
</tr>
<tr>
<td>night_start</td>
<td>time</td>
<td>YES</td>
<td></td>
<td>夜间时间段开始</td>
</tr>
<tr>
<td>night_end</td>
<td>time</td>
<td>YES</td>
<td></td>
<td>夜间时间段结束</td>
</tr>
<tr>
<td>night_per_kilo_price</td>
<td>double(10,2)</td>
<td>YES</td>
<td></td>
<td>夜间超公里加收单价</td>
</tr>
<tr>
<td>night_per_minute_price</td>
<td>double(10,2)</td>
<td>YES</td>
<td></td>
<td>夜间超时间加收单价</td>
</tr>
<tr>
<td>night_distance</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>夜间行驶总里程（公里）</td>
</tr>
<tr>
<td>night_time</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>夜间行驶总时间（分钟）</td>
</tr>
<tr>
<td>night_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>夜间服务费</td>
</tr>
<tr>
<td>beyond_start_kilo</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>远途起算公里</td>
</tr>
<tr>
<td>beyond_per_kilo_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>远途单价</td>
</tr>
<tr>
<td>beyond_distance</td>
<td>double(8,2)</td>
<td>NO</td>
<td></td>
<td>远途距离，超出远途的公里数</td>
</tr>
<tr>
<td>beyond_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>远途费</td>
</tr>
<tr>
<td>per_kilo_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>超公里单价(每公里单价)</td>
</tr>
<tr>
<td>path</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>(不包含起步)行驶总里程（公里）或分段计价合计里程（公里）</td>
</tr>
<tr>
<td>path_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>(不包含起步)行驶总里程价格或分段计价合计价格</td>
</tr>
<tr>
<td>per_minute_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>超时间单价(每分钟单价)或分段计价默认的每分钟单价</td>
</tr>
<tr>
<td>duration</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>(不包含起步)行驶时长（分钟）或分段计价合计时长（分钟）</td>
</tr>
<tr>
<td>duration_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>(不包含起步)行驶时长价格或分段计价合计时间价格</td>
</tr>
<tr>
<td>rest_duration</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>其他时段时长合计</td>
</tr>
<tr>
<td>rest_duration_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>其他时段时长费用合计</td>
</tr>
<tr>
<td>rest_distance</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>其他时段距离合计</td>
</tr>
<tr>
<td>rest_distance_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>其他时段距离费用合计</td>
</tr>
<tr>
<td>road_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>过路费</td>
</tr>
<tr>
<td>parking_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>停车费</td>
</tr>
<tr>
<td>other_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>其它费用</td>
</tr>
<tr>
<td>dynamic_discount_rate</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>动态调价的折扣率(0-1 两小数)</td>
</tr>
<tr>
<td>dynamic_discount</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>动态调价的金额</td>
</tr>
<tr>
<td>supplement_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>最低消费补足的费用</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>create_time</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>update_time</td>
</tr>
</tbody>
</table>


### 请求参数

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody">
               </tbody>
              </table>
            
## 分段计时计费明细表
<a id=分段计时计费明细表> </a>
### 基本信息

**Path：** /tbl_order_rule_price_detail

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>order_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>订单id</td>
</tr>
<tr>
<td>category</td>
<td>varchar(1)</td>
<td>NO</td>
<td></td>
<td>价格类型：0预约，1实际</td>
</tr>
<tr>
<td>start_hour</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>时间段-开始</td>
</tr>
<tr>
<td>end_hour</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>时间段-结束</td>
</tr>
<tr>
<td>per_kilo_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>超公里单价(每公里单价)</td>
</tr>
<tr>
<td>per_minute_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>超时间单价(每分钟单价)</td>
</tr>
<tr>
<td>duration</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>该时间段的时间统计</td>
</tr>
<tr>
<td>time_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>该时间段的时间价格合计</td>
</tr>
<tr>
<td>distance</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>该时间段的距离统计</td>
</tr>
<tr>
<td>distance_price</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>该时间段的距离价格合计</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>create_time</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>update_time</td>
</tr>
</tbody>
</table>


### 请求参数

## 订单优惠券使用记录
<a id=订单优惠券使用记录> </a>
### 基本信息

**Path：** /tbl_order_use_coupon

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(11) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>order_id</td>
<td>int(11) unsigned</td>
<td>NO</td>
<td></td>
<td>订单id</td>
</tr>
<tr>
<td>coupon_id</td>
<td>int(11) unsigned</td>
<td>NO</td>
<td></td>
<td>优惠券Id</td>
</tr>
<tr>
<td>category</td>
<td>char(1)</td>
<td>NO</td>
<td></td>
<td>0:预估 1，实际</td>
</tr>
<tr>
<td>coupon_money</td>
<td>float(10,2)</td>
<td>NO</td>
<td></td>
<td>优惠券金额</td>
</tr>
<tr>
<td>after_use_coupon_moeny</td>
<td>float(10,2)</td>
<td>YES</td>
<td></td>
<td>使用优惠券后订单金额</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>YES</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>更新时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 用户黑名单
<a id=用户黑名单> </a>
### 基本信息

**Path：** /tbl_passenger_blacklist

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>phone</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>电话号码</td>
</tr>
<tr>
<td>reason</td>
<td>char(1)</td>
<td>NO</td>
<td></td>
<td>1 个人用户1小时内连续取消订单3次 2 24小时内取消10次派车成功单</td>
</tr>
<tr>
<td>category</td>
<td>char(1)</td>
<td>NO</td>
<td></td>
<td>1 临时黑名单 2 永久黑名单</td>
</tr>
<tr>
<td>is_release</td>
<td>char(1)</td>
<td>NO</td>
<td></td>
<td>1 解禁，0 未解禁</td>
</tr>
<tr>
<td>release_time</td>
<td>timestamp</td>
<td>YES</td>
<td></td>
<td>解禁时间</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>create</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>update</td>
</tr>
</tbody>
</table>


### 请求参数

## 乘客统计信息表
<a id=乘客统计信息表> </a>
### 基本信息

**Path：** /tbl_passenger_statics

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>passenger_info_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>用户ID</td>
</tr>
<tr>
<td>total_distance</td>
<td>decimal(10,2) unsigned</td>
<td>NO</td>
<td></td>
<td>总里程</td>
</tr>
<tr>
<td>month_distance</td>
<td>decimal(10,2) unsigned</td>
<td>NO</td>
<td></td>
<td>当月里程</td>
</tr>
<tr>
<td>total_charge</td>
<td>decimal(10,2) unsigned</td>
<td>NO</td>
<td></td>
<td>充值总金额</td>
</tr>
<tr>
<td>total_refund</td>
<td>decimal(10,2) unsigned</td>
<td>NO</td>
<td></td>
<td>退款总额</td>
</tr>
<tr>
<td>total_order_pay</td>
<td>decimal(10,2) unsigned</td>
<td>NO</td>
<td></td>
<td>订单支付总额</td>
</tr>
<tr>
<td>month_order_pay</td>
<td>decimal(10,2) unsigned</td>
<td>NO</td>
<td></td>
<td>月订单支付总额</td>
</tr>
<tr>
<td>total_invoice</td>
<td>decimal(10,2) unsigned</td>
<td>NO</td>
<td></td>
<td>已开票总金额</td>
</tr>
<tr>
<td>can_invoice</td>
<td>decimal(10,2)</td>
<td>NO</td>
<td></td>
<td>未开票总金额</td>
</tr>
</tbody>
</table>


### 请求参数

## 充值交易记录
<a id=充值交易记录> </a>
### 基本信息

**Path：** /tbl_passenger_wallet_record

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(16)</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>passenger_info_id</td>
<td>int(16)</td>
<td>NO</td>
<td></td>
<td>用户ID</td>
</tr>
<tr>
<td>transaction_id</td>
<td>varchar(32)</td>
<td>YES</td>
<td></td>
<td>第三方支付ID</td>
</tr>
<tr>
<td>pay_time</td>
<td>datetime</td>
<td>NO</td>
<td></td>
<td>支付时间</td>
</tr>
<tr>
<td>pay_capital</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>本金</td>
</tr>
<tr>
<td>pay_give_fee</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>赠费</td>
</tr>
<tr>
<td>refund_capital</td>
<td>double(10,2)</td>
<td>YES</td>
<td></td>
<td>退款本金</td>
</tr>
<tr>
<td>refund_give_fee</td>
<td>double(10,2)</td>
<td>YES</td>
<td></td>
<td>退款赠费</td>
</tr>
<tr>
<td>recharge_discount</td>
<td>double(10,2)</td>
<td>NO</td>
<td></td>
<td>充值折扣</td>
</tr>
<tr>
<td>pay_type</td>
<td>tinyint(2)</td>
<td>NO</td>
<td></td>
<td>1：微信&nbsp;，2：账户余额，3：平台账户，4：支付宝</td>
</tr>
<tr>
<td>pay_status</td>
<td>tinyint(2)</td>
<td>NO</td>
<td></td>
<td>1：已支付&nbsp;，0：未支付</td>
</tr>
<tr>
<td>trade_type</td>
<td>tinyint(2)</td>
<td>NO</td>
<td></td>
<td>交易类型：&nbsp;<br data-tomark-pass="">1充值&nbsp;<br data-tomark-pass="">2消费&nbsp;<br data-tomark-pass="">3退款&nbsp;<br data-tomark-pass="">4订单冻结&nbsp;<br data-tomark-pass="">5订单补扣&nbsp;<br data-tomark-pass="">6尾款支付&nbsp;<br data-tomark-pass="">7解冻</td>
</tr>
<tr>
<td>trade_reason</td>
<td>varchar(100)</td>
<td>NO</td>
<td></td>
<td>交易原因</td>
</tr>
<tr>
<td>description</td>
<td>varchar(200)</td>
<td>NO</td>
<td></td>
<td>描述</td>
</tr>
<tr>
<td>create_user</td>
<td>varchar(20)</td>
<td>YES</td>
<td></td>
<td>创建用户</td>
</tr>
<tr>
<td>order_id</td>
<td>int(10)</td>
<td>YES</td>
<td></td>
<td>订单Id</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on&nbsp;update&nbsp;CURRENT_TIMESTAMP</td>
<td></td>
</tr>
</tbody>
</table>


### 请求参数

## 乘客钱包
<a id=乘客钱包> </a>
### 基本信息

**Path：** /tbl_passenger_wallet

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段</th>
<th>类型</th>
<th>允许为空</th>
<th>默认值</th>
<th>注释</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(16)</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>passenger_info_id</td>
<td>int(16)</td>
<td>YES</td>
<td></td>
<td>乘客Id</td>
</tr>
<tr>
<td>capital</td>
<td>double(10,2)</td>
<td>YES</td>
<td></td>
<td>本金</td>
</tr>
<tr>
<td>give_fee</td>
<td>double(10,2)</td>
<td>YES</td>
<td></td>
<td>赠费</td>
</tr>
<tr>
<td>freeze_capital</td>
<td>double(10,2)</td>
<td>YES</td>
<td></td>
<td>冻结本金</td>
</tr>
<tr>
<td>freeze_give_fee</td>
<td>double(10,2)</td>
<td>YES</td>
<td></td>
<td>冻结赠费</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>YES</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>YES</td>
<td>on&nbsp;update&nbsp;CURRENT_TIMESTAMP</td>
<td></td>
</tr>
</tbody>
</table>


### 请求参数

## 钱包冻结/解冻记录
<a id=钱包冻结/解冻记录> </a>
### 基本信息

**Path：** /tbl_passenger_wallet_freeze_record

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(11)</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>source</td>
<td>varchar(10)</td>
<td>NO</td>
<td></td>
<td>系统类型</td>
</tr>
<tr>
<td>jpush_id</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>接收通知的设备token</td>
</tr>
<tr>
<td>message_type</td>
<td>int(3)&nbsp;unsigned</td>
<td>NO</td>
<td></td>
<td>消息类型</td>
</tr>
<tr>
<td>message_body</td>
<td>varchar(512)</td>
<td>NO</td>
<td></td>
<td>消息内容</td>
</tr>
<tr>
<td>send_result</td>
<td>int(2)&nbsp;unsigned</td>
<td>NO</td>
<td></td>
<td>发送结果1：成功，0：失败</td>
</tr>
<tr>
<td>send_id</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>发送方id</td>
</tr>
<tr>
<td>send_identity</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>发送者身份类别</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>YES</td>
<td>on&nbsp;update&nbsp;CURRENT_TIMESTAMP</td>
<td></td>
</tr>
</tbody>
</table>


### 请求参数

## 人群标签
<a id=人群标签> </a>
### 基本信息

**Path：** /tbl_people_tag

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>tag_name</td>
<td>varchar(60)</td>
<td>NO</td>
<td></td>
<td>人群标签名称</td>
</tr>
<tr>
<td>tag_type</td>
<td>tinyint(4)</td>
<td>NO</td>
<td></td>
<td>目标类别 (1,passenger, 2,driver)</td>
</tr>
<tr>
<td>tag_conditions</td>
<td>varchar(2000)</td>
<td>NO</td>
<td></td>
<td>筛选条件</td>
</tr>
<tr>
<td>tag_number</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>标签人数(约数)</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>更新时间</td>
</tr>
<tr>
<td>operator_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>更新人id</td>
</tr>
</tbody>
</table>


### 请求参数

## 极光id手机表
<a id=极光id手机表> </a>
### 基本信息

**Path：** /tbl_push_account

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(16) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>source</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>设备来源 iOS,Android</td>
</tr>
<tr>
<td>jpush_id</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>消息推送设备id</td>
</tr>
<tr>
<td>yid</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>系统用户号，司机、乘客用yid，大屏唯一码、车机用唯一码</td>
</tr>
<tr>
<td>audience</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>听众类型：1：别名，2：注册Id</td>
</tr>
<tr>
<td>identity_status</td>
<td>int(2) unsigned</td>
<td>NO</td>
<td></td>
<td>身份标记 1:乘客，2：司机，3：车机，4：大屏</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>更新时间</td>
</tr>
</tbody>
</table>


### 请求参数

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody">
               </tbody>
              </table>
            
## 消息系统列表
<a id=消息系统列表> </a>
### 基本信息

**Path：** /tbl_push_loop_message

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(11)</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>source</td>
<td>varchar(10)</td>
<td>NO</td>
<td></td>
<td>系统类型</td>
</tr>
<tr>
<td>jpush_id</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>接收通知的设备token</td>
</tr>
<tr>
<td>message_type</td>
<td>int(3)&nbsp;unsigned</td>
<td>NO</td>
<td></td>
<td>消息类型</td>
</tr>
<tr>
<td>message_body</td>
<td>varchar(512)</td>
<td>NO</td>
<td></td>
<td>消息内容</td>
</tr>
<tr>
<td>send_result</td>
<td>int(2)&nbsp;unsigned</td>
<td>NO</td>
<td></td>
<td>发送结果1：成功，0：失败</td>
</tr>
<tr>
<td>send_id</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>发送方id</td>
</tr>
<tr>
<td>send_identity</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>发送者身份类别</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>YES</td>
<td>on&nbsp;update&nbsp;CURRENT_TIMESTAMP</td>
<td></td>
</tr>
</tbody>
</table>


### 请求参数

## 消息推送记录
<a id=消息推送记录> </a>
### 基本信息

**Path：** /tbl_push_message_record

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(11)</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>source</td>
<td>varchar(10)</td>
<td>NO</td>
<td></td>
<td>系统类型</td>
</tr>
<tr>
<td>jpush_id</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>接收通知的设备token</td>
</tr>
<tr>
<td>message_type</td>
<td>int(3)&nbsp;unsigned</td>
<td>NO</td>
<td></td>
<td>消息类型</td>
</tr>
<tr>
<td>message_body</td>
<td>varchar(512)</td>
<td>NO</td>
<td></td>
<td>消息内容</td>
</tr>
<tr>
<td>send_result</td>
<td>int(2)&nbsp;unsigned</td>
<td>NO</td>
<td></td>
<td>发送结果1：成功，0：失败</td>
</tr>
<tr>
<td>send_id</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>发送方id</td>
</tr>
<tr>
<td>send_identity</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>发送者身份类别</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>YES</td>
<td>on&nbsp;update&nbsp;CURRENT_TIMESTAMP</td>
<td></td>
</tr>
</tbody>
</table>


### 请求参数

## 充值金额规则
<a id=充值金额规则> </a>
### 基本信息

**Path：** /tbl_recharge_price

**Method：** GET

**接口描述：**
undefined

### 请求参数

## 通话记录上传记录表
<a id=通话记录上传记录表> </a>
### 基本信息

**Path：** /tbl_secret_voice_records

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(11)</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>call_id</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td></td>
</tr>
<tr>
<td>subs_id</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>对应的三元组的绑定关系ID</td>
</tr>
<tr>
<td>call_time</td>
<td>datetime</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>呼叫时间</td>
</tr>
<tr>
<td>flag</td>
<td>int(1)</td>
<td>NO</td>
<td></td>
<td>是否下载文件0：未下载&nbsp; 1：已下载</td>
</tr>
<tr>
<td>oss_download_url</td>
<td>varchar(512)</td>
<td>YES</td>
<td></td>
<td>文件下载地址</td>
</tr>
</tbody>
</table>


### 请求参数

## 服务类型表
<a id=服务类型表> </a>
### 基本信息

**Path：** /tbl_service_type

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(11)</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>service_type_name</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>服务类型名称</td>
</tr>
<tr>
<td>service_type_status</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>服务类型状态 1开启 0暂停</td>
</tr>
<tr>
<td>is_use</td>
<td>char(1)</td>
<td>NO</td>
<td></td>
<td>使用状态 1使用 0未使用</td>
</tr>
<tr>
<td>operator_id</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td>操作人id</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>更新时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 系统配置杂项
<a id=系统配置杂项> </a>
### 基本信息

**Path：** /tbl_sys_config

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>mediumint(8) unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>conf_key</td>
<td>varchar(30)</td>
<td>NO</td>
<td></td>
<td>配置项</td>
</tr>
<tr>
<td>conf_val</td>
<td>varchar(2000)</td>
<td>NO</td>
<td></td>
<td>配置值</td>
</tr>
<tr>
<td>conf_name</td>
<td>varchar(30)</td>
<td>NO</td>
<td></td>
<td>配置名称</td>
</tr>
</tbody>
</table>


### 请求参数

## 用户优惠券表
<a id=用户优惠券表> </a>
### 基本信息

**Path：** /tbl_user_coupon

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(11)</td>
<td>NO</td>
<td>auto_increment</td>
<td>领取记录ID</td>
</tr>
<tr>
<td>passenger_id</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td>乘客ID</td>
</tr>
<tr>
<td>phone_number</td>
<td>varchar(20)</td>
<td>NO</td>
<td></td>
<td>电话号码</td>
</tr>
<tr>
<td>order_id</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>关联订单号</td>
</tr>
<tr>
<td>coupon_id</td>
<td>int(11) unsigned</td>
<td>NO</td>
<td></td>
<td>优惠券ID</td>
</tr>
<tr>
<td>coupon_name</td>
<td>varchar(30)</td>
<td>YES</td>
<td></td>
<td></td>
</tr>
<tr>
<td>coupon_type</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>优惠券类型 1:现金券, 2:专项券-免费送车券, 3:专项券-免费还车券 4:折扣券</td>
</tr>
<tr>
<td>get_method</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>1,主动发放. 2,用户获取</td>
</tr>
<tr>
<td>enable_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>优惠券起效时间</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>获取时间</td>
</tr>
<tr>
<td>expire_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>过期时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>使用时间</td>
</tr>
<tr>
<td>use_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>使用时间</td>
</tr>
<tr>
<td>is_use</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>状态 0:未使用, 1:已使用</td>
</tr>
<tr>
<td>minimum_amount</td>
<td>decimal(10,2)</td>
<td>NO</td>
<td></td>
<td>最低消费金额</td>
</tr>
<tr>
<td>reduction_amount</td>
<td>decimal(10,2)</td>
<td>NO</td>
<td></td>
<td>减免金额(现金券：能抵扣的金额,折扣券：最高能抵扣的金额)</td>
</tr>
<tr>
<td>discount</td>
<td>decimal(4,2)</td>
<td>NO</td>
<td></td>
<td>折扣8,7.5</td>
</tr>
<tr>
<td>function_type</td>
<td>int(4)</td>
<td>NO</td>
<td></td>
<td>功能类型 1:市场活动, 2:订单赔付</td>
</tr>
<tr>
<td>indemnity_record_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>赔付记录ID</td>
</tr>
<tr>
<td>activity_tag</td>
<td>varchar(30)</td>
<td>NO</td>
<td></td>
<td>活动标记</td>
</tr>
<tr>
<td>activity_id</td>
<td>int(11) unsigned</td>
<td>NO</td>
<td></td>
<td>活动ID</td>
</tr>
</tbody>
</table>


### 请求参数

## 乘客信息表
<a id=乘客信息表> </a>
### 基本信息

**Path：** /tbl_passenger_info

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(16)</td>
<td>NO</td>
<td>auto_increment</td>
<td>主键id</td>
</tr>
<tr>
<td>passenger_info_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>乘客id</td>
</tr>
<tr>
<td>latitude</td>
<td>double(10,6)</td>
<td>YES</td>
<td></td>
<td>地址纬度</td>
</tr>
<tr>
<td>longitude</td>
<td>double(10,6)</td>
<td>YES</td>
<td></td>
<td>地址经度</td>
</tr>
<tr>
<td>address_name</td>
<td>varchar(64)</td>
<td>YES</td>
<td></td>
<td>详细地址</td>
</tr>
<tr>
<td>type</td>
<td>int(2)</td>
<td>YES</td>
<td></td>
<td>0:家，1：公司</td>
</tr>
<tr>
<td>address_desc</td>
<td>varchar(2048)</td>
<td>YES</td>
<td></td>
<td>地址描述</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>YES</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>创建时间</td>
</tr>
</tbody>
</table>
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(16)</td>
<td>NO</td>
<td>auto_increment</td>
<td>主键id</td>
</tr>
<tr>
<td>phone</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>电话</td>
</tr>
<tr>
<td>educatioan</td>
<td>varchar(255)</td>
<td>YES</td>
<td></td>
<td>学历</td>
</tr>
<tr>
<td>birthday</td>
<td>date</td>
<td>YES</td>
<td></td>
<td>生日</td>
</tr>
<tr>
<td>passenger_name</td>
<td>varchar(16)</td>
<td>NO</td>
<td></td>
<td>乘客名称</td>
</tr>
<tr>
<td>register_time</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>注册时间</td>
</tr>
<tr>
<td>balance</td>
<td>decimal(10,2) unsigned</td>
<td>NO</td>
<td></td>
<td>余额</td>
</tr>
<tr>
<td>gender</td>
<td>tinyint(2) unsigned</td>
<td>NO</td>
<td></td>
<td>0：女，1：男</td>
</tr>
<tr>
<td>head_img</td>
<td>varchar(256)</td>
<td>NO</td>
<td></td>
<td>头像</td>
</tr>
<tr>
<td>passenger_type</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>用户类型，1：个人用户，2：企业用户</td>
</tr>
<tr>
<td>user_level</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>会员等级</td>
</tr>
<tr>
<td>register_type</td>
<td>smallint(6) unsigned</td>
<td>NO</td>
<td></td>
<td>注册渠道 1 安卓 2 ios</td>
</tr>
<tr>
<td>last_login_time</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>最后一次登录时间</td>
</tr>
<tr>
<td>last_login_method</td>
<td>tinyint(3) unsigned</td>
<td>NO</td>
<td></td>
<td>上次登陆方式:1,验证码,2密码</td>
</tr>
<tr>
<td>last_login_screen_time</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>上次登录大屏时间</td>
</tr>
<tr>
<td>last_login_screen_method</td>
<td>char(1)</td>
<td>NO</td>
<td></td>
<td>上次登录大屏方式</td>
</tr>
<tr>
<td>last_order_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>最后一次下单时间</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>修改时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 车辆信息表
<a id=车辆信息表> </a>
### 基本信息

**Path：** /tbl_car_info

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td>车辆id</td>
</tr>
<tr>
<td>company_logo</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>公司标识</td>
</tr>
<tr>
<td>car_label</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>车辆厂牌</td>
</tr>
<tr>
<td>car_base_type</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>车辆类型</td>
</tr>
<tr>
<td>car_owner</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>车辆所有人</td>
</tr>
<tr>
<td>plate_color</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>车牌颜色</td>
</tr>
<tr>
<td>engine_number</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>发动机号电动机号</td>
</tr>
<tr>
<td>car_brain_plate</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>车脑品牌</td>
</tr>
<tr>
<td>car_brain_number</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>车脑编号</td>
</tr>
<tr>
<td>vin_number</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>vin码</td>
</tr>
<tr>
<td>register_time</td>
<td>date</td>
<td>YES</td>
<td></td>
<td>注册日期</td>
</tr>
<tr>
<td>fuel_type</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>燃料类型</td>
</tr>
<tr>
<td>engine_capacity</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>发动机排量</td>
</tr>
<tr>
<td>car_img_file_number</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>车辆照片文件编号</td>
</tr>
<tr>
<td>transport_number</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>运输证字号</td>
</tr>
<tr>
<td>transport_issuing_authority</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>车辆运输证发证机构</td>
</tr>
<tr>
<td>business_area</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>经营区域</td>
</tr>
<tr>
<td>transport_certificate_validity_start</td>
<td>date</td>
<td>YES</td>
<td></td>
<td>车辆运输证有效期起</td>
</tr>
<tr>
<td>transport_certificate_validity_end</td>
<td>date</td>
<td>YES</td>
<td></td>
<td>车辆运输证有效期止</td>
</tr>
<tr>
<td>first_register_time</td>
<td>date</td>
<td>YES</td>
<td></td>
<td>车辆初次登记日期</td>
</tr>
<tr>
<td>state_of_repair</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>车辆检修状态</td>
</tr>
<tr>
<td>next_annual_inspection_time</td>
<td>date</td>
<td>YES</td>
<td></td>
<td>下次年检时间</td>
</tr>
<tr>
<td>annual_audit_status</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>年度审核状态</td>
</tr>
<tr>
<td>invoice_printing_equipment_number</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>发票打印设备序列号</td>
</tr>
<tr>
<td>gps_brand</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>卫星定位装置品牌</td>
</tr>
<tr>
<td>gps_model</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>型号</td>
</tr>
<tr>
<td>gps_imei</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>imei</td>
</tr>
<tr>
<td>gps_install_time</td>
<td>date</td>
<td>YES</td>
<td></td>
<td>安装日期</td>
</tr>
<tr>
<td>report_time</td>
<td>date</td>
<td>YES</td>
<td></td>
<td>报备日期</td>
</tr>
<tr>
<td>service_type</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>服务类型</td>
</tr>
<tr>
<td>charge_type_code</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>运价类型编码</td>
</tr>
<tr>
<td>car_invoice_img</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>车辆发票</td>
</tr>
<tr>
<td>quality_certificate_img</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>合格证</td>
</tr>
<tr>
<td>vehicle_license_img</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>行驶证</td>
</tr>
<tr>
<td>registration_certificate_img</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>登记证书</td>
</tr>
<tr>
<td>tax_payment_certificate_img</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>完税证明</td>
</tr>
<tr>
<td>transport_certificate_img</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>汽车运输证</td>
</tr>
<tr>
<td>other_img1</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>其他一</td>
</tr>
<tr>
<td>other_img2</td>
<td>varchar(128)</td>
<td>NO</td>
<td></td>
<td>其他二</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>更新时间</td>
</tr>
</tbody>
</table>
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10)</td>
<td>NO</td>
<td>auto_increment</td>
<td>车辆id</td>
</tr>
<tr>
<td>plate_number</td>
<td>varchar(16)</td>
<td>NO</td>
<td></td>
<td>车牌号</td>
</tr>
<tr>
<td>operation_status</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>运营状态：-1，删除 0，上架 1，下架 2，待整备</td>
</tr>
<tr>
<td>publish_time</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>上架时间</td>
</tr>
<tr>
<td>full_name</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>车辆全名</td>
</tr>
<tr>
<td>color</td>
<td>varchar(30)</td>
<td>NO</td>
<td></td>
<td>车身颜色</td>
</tr>
<tr>
<td>car_img</td>
<td>varchar(256)</td>
<td>NO</td>
<td></td>
<td>汽车图片</td>
</tr>
<tr>
<td>city_code</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>城市</td>
</tr>
<tr>
<td>car_type_id</td>
<td>int(16) unsigned</td>
<td>NO</td>
<td></td>
<td>车辆类型</td>
</tr>
<tr>
<td>car_level_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>车辆级别</td>
</tr>
<tr>
<td>regist_date</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>上牌日期</td>
</tr>
<tr>
<td>insurance_start_date</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>保险生效日期</td>
</tr>
<tr>
<td>insurance_end_date</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>保险失效日期</td>
</tr>
<tr>
<td>annual_end_date</td>
<td>datetime</td>
<td>YES</td>
<td></td>
<td>年检到期日期</td>
</tr>
<tr>
<td>car_license_img</td>
<td>varchar(256)</td>
<td>NO</td>
<td></td>
<td>行驶本图片地址</td>
</tr>
<tr>
<td>is_free_order</td>
<td>int(2)</td>
<td>YES</td>
<td></td>
<td>是否开启顺风单0：停用，1：启用</td>
</tr>
<tr>
<td>remark</td>
<td>varchar(256)</td>
<td>NO</td>
<td></td>
<td>备注</td>
</tr>
<tr>
<td>use_status</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>启用停用状态，0：停用，1：启用</td>
</tr>
<tr>
<td>large_screen_device_code</td>
<td>varchar(256)</td>
<td>NO</td>
<td></td>
<td>大屏编号</td>
</tr>
<tr>
<td>large_screen_device_brand</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>大屏品牌名称</td>
</tr>
<tr>
<td>car_screen_device_code</td>
<td>varchar(256)</td>
<td>NO</td>
<td></td>
<td>车机设备号</td>
</tr>
<tr>
<td>car_screen_device_brand</td>
<td>varchar(64)</td>
<td>NO</td>
<td></td>
<td>车机品牌名称</td>
</tr>
<tr>
<td>operator_id</td>
<td>int(10) unsigned</td>
<td>NO</td>
<td></td>
<td>操作人ID</td>
</tr>
<tr>
<td>total_mile</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td>行驶总里程单位：km</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>修改时间~~~~</td>
</tr>
</tbody>
</table>


### 请求参数

## 短信记录
<a id=短信记录> </a>
### 基本信息

**Path：** /tbl_sms

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
<th></th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(11)</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
<td></td>
</tr>
<tr>
<td>passenger_phone_number</td>
<td>varchar(16)</td>
<td>NO</td>
<td></td>
<td>乘客手机号</td>
<td></td>
</tr>
<tr>
<td>sms_content</td>
<td>varchar(512)</td>
<td>NO</td>
<td></td>
<td>短信内容</td>
<td></td>
</tr>
<tr>
<td>send_time</td>
<td>datetime</td>
<td>NO</td>
<td></td>
<td>发送时间</td>
<td></td>
</tr>
<tr>
<td>operator</td>
<td>varchar(255)</td>
<td>NO</td>
<td></td>
<td>操作人</td>
<td></td>
</tr>
<tr>
<td>send_flag</td>
<td>tinyint(1)</td>
<td>NO</td>
<td></td>
<td>发送状态&nbsp;0:失败&nbsp;&nbsp;1:&nbsp;成功</td>
<td></td>
</tr>
<tr>
<td>send_number</td>
<td>tinyint(1)</td>
<td>NO</td>
<td></td>
<td>发送失败次数</td>
<td></td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>YES</td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>YES</td>
<td>on&nbsp;update&nbsp;CURRENT_TIMESTAMP</td>
<td></td>
<td></td>
</tr>
</tbody>
</table>


### 请求参数

## 短信模版
<a id=短信模版> </a>
### 基本信息

**Path：** /tbl_sms_template

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td></td>
</tr>
<tr>
<td>template_id</td>
<td>varchar(16)</td>
<td>NO</td>
<td></td>
<td>短信模板ID</td>
</tr>
<tr>
<td>template_name</td>
<td>varchar(128)</td>
<td>YES</td>
<td></td>
<td></td>
</tr>
<tr>
<td>content</td>
<td>varchar(512)</td>
<td>NO</td>
<td></td>
<td>模板内容</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>YES</td>
<td></td>
<td></td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>YES</td>
<td>on&nbsp;update&nbsp;CURRENT_TIMESTAMP</td>
<td></td>
</tr>
</tbody>
</table>


### 请求参数

## 服务表
<a id=服务表> </a>
### 基本信息

**Path：** /tbl_service

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(11)</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>city_code</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>城市编码</td>
</tr>
<tr>
<td>service_type_id</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td>服务类型id</td>
</tr>
<tr>
<td>together_order_number</td>
<td>int(4)</td>
<td>NO</td>
<td></td>
<td>同时可下单数量</td>
</tr>
<tr>
<td>service_status</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>服务开启状态 0暂停 1开启</td>
</tr>
<tr>
<td>operator_id</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td>操作人id</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>更新时间</td>
</tr>
</tbody>
</table>


### 请求参数

## tv平台应用
<a id=tv平台应用> </a>
### 基本信息

**Path：** /tbl_tv_apps

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(11)</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>app_name</td>
<td>varchar(16)</td>
<td>NO</td>
<td></td>
<td>应用名称</td>
</tr>
<tr>
<td>version_code</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td>版本号</td>
</tr>
<tr>
<td>start_time</td>
<td>datetime</td>
<td>NO</td>
<td></td>
<td>开始更新时间</td>
</tr>
<tr>
<td>down_load_url</td>
<td>varchar(255)</td>
<td>NO</td>
<td></td>
<td>应用包下载链接</td>
</tr>
<tr>
<td>package_name</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>包名</td>
</tr>
<tr>
<td>ico_url</td>
<td>varchar(255)</td>
<td>NO</td>
<td></td>
<td>应用图标</td>
</tr>
<tr>
<td>use_status</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>应用状态 1启用 0停用</td>
</tr>
<tr>
<td>position</td>
<td>int(3)</td>
<td>NO</td>
<td></td>
<td>应用位置</td>
</tr>
<tr>
<td>is_del</td>
<td>int(2)</td>
<td>NO</td>
<td></td>
<td>是否删除 1是 0否</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>更新时间</td>
</tr>
<tr>
<td>operator_id</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td>创建人id</td>
</tr>
</tbody>
</table>


### 请求参数

## 大屏升级
<a id=大屏升级> </a>
### 基本信息

**Path：** /tbl_tv_version_update

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>PK</th>
<th>字段说明</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(16)</td>
<td>NO</td>
<td>auto_increment</td>
<td>ID</td>
</tr>
<tr>
<td>name</td>
<td>varchar(16)</td>
<td>NO</td>
<td></td>
<td>TV平台版本名称</td>
</tr>
<tr>
<td>tv_version_code</td>
<td>int(4)</td>
<td>NO</td>
<td></td>
<td>tvVersionCode</td>
</tr>
<tr>
<td>tv_version</td>
<td>varchar(16)</td>
<td>NO</td>
<td></td>
<td>版本号</td>
</tr>
<tr>
<td>notice_type</td>
<td>smallint(6)</td>
<td>NO</td>
<td></td>
<td>通知类型（1:强制 2:非强制）</td>
</tr>
<tr>
<td>prompt</td>
<td>varchar(50)</td>
<td>NO</td>
<td></td>
<td>升级提示（不超过30个字）</td>
</tr>
<tr>
<td>note</td>
<td>varchar(500)</td>
<td>NO</td>
<td></td>
<td>备注</td>
</tr>
<tr>
<td>start_time</td>
<td>datetime</td>
<td>NO</td>
<td></td>
<td>生效开始时间</td>
</tr>
<tr>
<td>end_time</td>
<td>datetime</td>
<td>NO</td>
<td></td>
<td>生效结束时间</td>
</tr>
<tr>
<td>download_url</td>
<td>varchar(512)</td>
<td>NO</td>
<td></td>
<td>安装包URL</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td>创建时间</td>
</tr>
<tr>
<td>operator_id</td>
<td>int(11)</td>
<td>NO</td>
<td></td>
<td>创建人id</td>
</tr>
<tr>
<td>use_status</td>
<td>tinyint(2)</td>
<td>NO</td>
<td></td>
<td>启用停用状态，0：停用，1：启用</td>
</tr>
<tr>
<td>update_time</td>
<td>timestamp</td>
<td>NO</td>
<td>on update CURRENT_TIMESTAMP</td>
<td>更新时间</td>
</tr>
</tbody>
</table>


### 请求参数

## 业务消息表
<a id=业务消息表> </a>
### 基本信息

**Path：** /tbl_message_show

**Method：** GET

**接口描述：**
<table>
<thead>
<tr>
<th>字段名</th>
<th>数据类型</th>
<th>允许为空</th>
<th>主键</th>
<th>注释</th>
</tr>
</thead>
<tbody>
<tr>
<td>id</td>
<td>int(10)&nbsp;unsigned</td>
<td>NO</td>
<td>auto_increment</td>
<td></td>
</tr>
<tr>
<td>title</td>
<td>varchar(255)</td>
<td>YES</td>
<td></td>
<td>标题</td>
</tr>
<tr>
<td>content</td>
<td>varchar(512)</td>
<td>NO</td>
<td></td>
<td>消息体</td>
</tr>
<tr>
<td>yid</td>
<td>varchar(32)</td>
<td>NO</td>
<td></td>
<td>乘客、司机id,大屏设备号</td>
</tr>
<tr>
<td>accept_identity</td>
<td>tinyint(3)</td>
<td>NO</td>
<td></td>
<td>接收端（1：乘客；2：司机；4：大屏）</td>
</tr>
<tr>
<td>send_time</td>
<td>datetime</td>
<td>NO</td>
<td></td>
<td>发送时间</td>
</tr>
<tr>
<td>push_type</td>
<td>tinyint(4)</td>
<td>NO</td>
<td></td>
<td>推送类型&nbsp;（1：营销通知，2：系统通知，3：订单通知，4：支付通知）</td>
</tr>
<tr>
<td>status</td>
<td>tinyint(1)</td>
<td>NO</td>
<td></td>
<td>是否显示（0：不显示，1：显示）</td>
</tr>
<tr>
<td>is_read</td>
<td>tinyint(1)</td>
<td>NO</td>
<td></td>
<td>是否已读（0：未读，1：已读）</td>
</tr>
<tr>
<td>order_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>订单号</td>
</tr>
<tr>
<td>sms_send_app_id</td>
<td>int(10)</td>
<td>NO</td>
<td></td>
<td>推送任务id</td>
</tr>
<tr>
<td>create_time</td>
<td>timestamp</td>
<td>NO</td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
</tbody>
</table>


### 请求参数

### 返回数据

<table>
  <thead class="ant-table-thead">
    <tr>
      <th key=name>名称</th><th key=type>类型</th><th key=required>是否必须</th><th key=default>默认值</th><th key=desc>备注</th><th key=sub>其他信息</th>
    </tr>
  </thead><tbody className="ant-table-tbody">
               </tbody>
              </table>
            