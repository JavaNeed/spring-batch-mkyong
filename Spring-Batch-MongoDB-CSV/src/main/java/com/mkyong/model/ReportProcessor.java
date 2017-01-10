package com.mkyong.model;

import java.text.SimpleDateFormat;

import org.springframework.batch.item.ItemProcessor;

public class ReportProcessor implements ItemProcessor<Report, Report> {

	@Override
	public Report process(Report item) throws Exception {

		return item;
	}
}
