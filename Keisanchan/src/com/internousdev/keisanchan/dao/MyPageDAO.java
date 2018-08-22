package com.internousdev.keisanchan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.keisanchan.dto.MyPageDTO;
import com.internousdev.keisanchan.util.DBConnector;

public class MyPageDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	public ArrayList<MyPageDTO> getMyPageUserInfo (String company_name, String roa, String roe, String uriage_keijo_ratio, String uriage_sori_ratio, String uriage_eigyo_ratio, String total_kaiten_ratio, String zaiko_kaiten_ratio, String ryudo_ratio, String zikoshi_ratio, String kotei_ratio, String fusai_ratio)throws SQLException{
		ArrayList<MyPageDTO> myPageDTO = new ArrayList<MyPageDTO>();
		String sql="SELECT kt.id, iit.item_name, ubit.total_price, ubit.total_count, ubit.pay, ubit.insert_date FROM user_buy_item_transaction ubit LEFT JOIN item_info_transaction iit ON ubit.item_transaction_id = iit.id WHERE ubit.item_transaction_id = ? AND ubit.user_master_id = ?  ORDER BY insert_date DESC";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, company_name);
			preparedStatement.setString(2, roe);
			preparedStatement.setString(3, roe);
			preparedStatement.setString(4, uriage_keijo_ratio);
			preparedStatement.setString(5, uriage_sori_ratio);
			preparedStatement.setString(6, uriage_eigyo_ratio);
			preparedStatement.setString(7, total_kaiten_ratio);
			preparedStatement.setString(8, zaiko_kaiten_ratio);
			preparedStatement.setString(9, ryudo_ratio);
			preparedStatement.setString(10, zikoshi_ratio);
			preparedStatement.setString(11,  kotei_ratio);
			preparedStatement.setString(12, fusai_ratio);

			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				MyPageDTO dto = new MyPageDTO();
				dto.setCompany_name(resultSet.getString("company_name"));
				dto.setRoe(resultSet.getDouble("roe"));
				dto.setRoa(resultSet.getDouble("roa"));
				dto.setUriage_keijo_ratio(resultSet.getDouble("uriag_keijo_ratio"));
				dto.setUriage_sori_ratio(resultSet.getDouble("uriage_sori_ratio"));
				dto.setUriage_eigyo_ratio(resultSet.getDouble("uriage_eigyo_ratio"));
				dto.setTotal_kaiten_ratio(resultSet.getDouble("total_kaiten_ratio"));
				dto.setZaiko_kaiten_ratio(resultSet.getDouble("zaiko_kaiten_ratio"));
				dto.setRyudo_ratio(resultSet.getDouble("ryudo_ratio"));
				dto.setZikoshi_ratio(resultSet.getDouble("zikoshi_ratio"));
				dto.setKotei_ratio(resultSet.getDouble("kotei_ratio"));
				dto.setFusai_ratio(resultSet.getDouble("fusai_ratio"));
				myPageDTO.add(dto);
			}

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return myPageDTO;
	}

	public int buyItemHistoryDelete(String company_name, String roe, String roa, String uriage_keijo_ratio, String uriage_sori_ratio, String uriage_eigyo_ratio, String total_kaiten_ratio, String zaiko_kaiten_ratio, String ryudo_ratio, String zikoshi_ratio, String kotei_ratio, String fusai_ratio) throws SQLException{
		String sql="DELETE FROM user_buy_item_transaction WHERE item_transaction_id = ? AND user_master_id = ?";

		PreparedStatement preparedStatement;
		int result = 0;
		try{
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, company_name);
			preparedStatement.setString(2, roe);
			preparedStatement.setString(3, roe);
			preparedStatement.setString(4, uriage_keijo_ratio);
			preparedStatement.setString(5, uriage_sori_ratio);
			preparedStatement.setString(6, uriage_eigyo_ratio);
			preparedStatement.setString(7, total_kaiten_ratio);
			preparedStatement.setString(8, zaiko_kaiten_ratio);
			preparedStatement.setString(9, ryudo_ratio);
			preparedStatement.setString(10, zikoshi_ratio);
			preparedStatement.setString(11,  kotei_ratio);
			preparedStatement.setString(12, fusai_ratio);
			result = preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return result;
	}

}