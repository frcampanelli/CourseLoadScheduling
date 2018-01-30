package org.dselent.scheduling.server.model;

import java.sql.JDBCType;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseSections {
		// table name
		public static final String TABLE_NAME = "course_sections";
			
		// column names
		public static enum Columns
		{
			TERMS_NAME,
			SECTION_TYPE,
			SECTIONS_NAME,
			DAYS,
			COURSES_NUMBER,
			COURSES_TITLE,
			START_TIME,
			END_TIME
		}
		
		// enum list
		private static final List<Columns> COLUMN_LIST = new ArrayList<>();
		
		// type mapping
		private static final Map<Columns, JDBCType> COLUMN_TYPE_MAP = new HashMap<>();
		
		static
		{
			for(Columns key : Columns.values())
			{
				COLUMN_LIST.add(key);
			}
			COLUMN_TYPE_MAP.put(Columns.TERMS_NAME, JDBCType.VARCHAR);
			COLUMN_TYPE_MAP.put(Columns.SECTION_TYPE, JDBCType.VARCHAR);
			COLUMN_TYPE_MAP.put(Columns.SECTIONS_NAME, JDBCType.VARCHAR);
			COLUMN_TYPE_MAP.put(Columns.DAYS, JDBCType.VARCHAR);
			COLUMN_TYPE_MAP.put(Columns.COURSES_NUMBER, JDBCType.VARCHAR);
			COLUMN_TYPE_MAP.put(Columns.COURSES_TITLE, JDBCType.VARCHAR);
			COLUMN_TYPE_MAP.put(Columns.START_TIME, JDBCType.TIMESTAMP);
			COLUMN_TYPE_MAP.put(Columns.END_TIME, JDBCType.TIMESTAMP);

		};
		
		// attributes
		private String termsName;
		private String sectionType;
		private String sectionsName;
		private String days;
		private String coursesNumber;
		private String coursesTitle;
		private Timestamp startTime;
		private Timestamp endTime;

		// methods
		
		public static JDBCType getColumnType(Columns column)
		{
			return COLUMN_TYPE_MAP.get(column);
		}
		
		public static String getColumnName(Columns column)
		{
			return column.toString().toLowerCase();
		}
		
		public static List<String> getColumnNameList()
		{
			List<String> columnNameList = new ArrayList<>();
			
			for(Columns column : COLUMN_LIST)
			{
				columnNameList.add(getColumnName(column));
			}
			
			return columnNameList;
		}

		
		//Setters and Getters
		public String getTermsName() {
			return termsName;
		}

		public void setTermsName(String termsName) {
			this.termsName = termsName;
		}

		public String getSectionType() {
			return sectionType;
		}

		public void setSectionType(String sectionType) {
			this.sectionType = sectionType;
		}

		public String getSectionsName() {
			return sectionsName;
		}

		public void setSectionsName(String sectionsName) {
			this.sectionsName = sectionsName;
		}

		public String getDays() {
			return days;
		}

		public void setDays(String days) {
			this.days = days;
		}

		public String getCoursesNumber() {
			return coursesNumber;
		}

		public void setCoursesNumber(String coursesNumber) {
			this.coursesNumber = coursesNumber;
		}

		public String getCoursesTitle() {
			return coursesTitle;
		}

		public void setCoursesTitle(String coursesTitle) {
			this.coursesTitle = coursesTitle;
		}

		public Timestamp getStartTime() {
			return startTime;
		}

		public void setStartTime(Timestamp startTime) {
			this.startTime = startTime;
		}

		public Timestamp getEndTime() {
			return endTime;
		}

		public void setEndTime(Timestamp endTime) {
			this.endTime = endTime;
		}

		//Auto-generated hashCode and equals
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((coursesNumber == null) ? 0 : coursesNumber.hashCode());
			result = prime * result + ((coursesTitle == null) ? 0 : coursesTitle.hashCode());
			result = prime * result + ((days == null) ? 0 : days.hashCode());
			result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
			result = prime * result + ((sectionType == null) ? 0 : sectionType.hashCode());
			result = prime * result + ((sectionsName == null) ? 0 : sectionsName.hashCode());
			result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
			result = prime * result + ((termsName == null) ? 0 : termsName.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (!(obj instanceof CourseSections)) {
				return false;
			}
			CourseSections other = (CourseSections) obj;
			if (coursesNumber == null) {
				if (other.coursesNumber != null) {
					return false;
				}
			} else if (!coursesNumber.equals(other.coursesNumber)) {
				return false;
			}
			if (coursesTitle == null) {
				if (other.coursesTitle != null) {
					return false;
				}
			} else if (!coursesTitle.equals(other.coursesTitle)) {
				return false;
			}
			if (days == null) {
				if (other.days != null) {
					return false;
				}
			} else if (!days.equals(other.days)) {
				return false;
			}
			if (endTime == null) {
				if (other.endTime != null) {
					return false;
				}
			} else if (!endTime.equals(other.endTime)) {
				return false;
			}
			if (sectionType == null) {
				if (other.sectionType != null) {
					return false;
				}
			} else if (!sectionType.equals(other.sectionType)) {
				return false;
			}
			if (sectionsName == null) {
				if (other.sectionsName != null) {
					return false;
				}
			} else if (!sectionsName.equals(other.sectionsName)) {
				return false;
			}
			if (startTime == null) {
				if (other.startTime != null) {
					return false;
				}
			} else if (!startTime.equals(other.startTime)) {
				return false;
			}
			if (termsName == null) {
				if (other.termsName != null) {
					return false;
				}
			} else if (!termsName.equals(other.termsName)) {
				return false;
			}
			return true;
		}

		//toString
		@Override
		public String toString() {
			return "CourseSections [termsName=" + termsName + ", sectionType=" + sectionType + ", sectionsName="
					+ sectionsName + ", days=" + days + ", coursesNumber=" + coursesNumber + ", coursesTitle="
					+ coursesTitle + ", startTime=" + startTime + ", endTime=" + endTime + "]";
		}
		
}