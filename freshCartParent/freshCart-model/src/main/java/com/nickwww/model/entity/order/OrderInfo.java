package com.nickwww.model.entity.order;

import com.nickwww.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Schema(description = "OrderInfo")
public class OrderInfo extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Schema(description = "User ID")
	private Long userId;

	@Schema(description = "Nickname")
	private String nickName;

	@Schema(description = "Order Number")
	private String orderNo;

	@Schema(description = "Coupon ID")
	private Long couponId;

	@Schema(description = "Total Amount")
	private BigDecimal totalAmount;

	@Schema(description = "Coupon Amount")
	private BigDecimal couponAmount;

	@Schema(description = "Original Total Amount")
	private BigDecimal originalTotalAmount;

	@Schema(description = "Freight Fee")
	private BigDecimal freightFee;

	@Schema(description = "Payment Type")
	private Integer payType;

	@Schema(description = "Order Status[0->Pending Payment；" +
			"1->Pending Shipment；2->Shipped；3->Pending Customer Receipt, Completed；-1->Cancelled]")
	private Integer orderStatus;

	@Schema(description = "Receiver Name")
	private String receiverName;

	@Schema(description = "Receiver Phone")
	private String receiverPhone;

	@Schema(description = "Receiver Tag Name")
	private String receiverTagName;

	@Schema(description = "Receiver State")
	private String receiverState;

	@Schema(description = "Receiver City")
	private String receiverCity;

	@Schema(description = "Receiver District")
	private String receiverDistrict;

	@Schema(description = "Receiver Address")
	private String receiverAddress;

	@Schema(description = "Payment Time")
	private Date paymentTime;

	@Schema(description = "Delivery Time")
	private Date deliveryTime;

	@Schema(description = "Receive Time")
	private Date receiveTime;

	@Schema(description = "Remark")
	private String remark;

	@Schema(description = "Cancel Time")
	private Date cancelTime;

	@Schema(description = "Cancel Reason")
	private String cancelReason;

	@Schema(description = "OrderItem List")
	private List<OrderItem> orderItemList;
}
