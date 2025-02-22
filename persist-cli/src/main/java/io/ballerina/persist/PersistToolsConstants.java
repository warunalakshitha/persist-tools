/*
 *  Copyright (c) 2022, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package io.ballerina.persist;

import java.util.Set;

/**
 * Persist Tool constants class.
 *
 * @since 0.1.0
 */
public class PersistToolsConstants {

    private PersistToolsConstants() {}

    public static final String COMPONENT_IDENTIFIER = "persist";

    public static final String EMPTY_VALUE = "";
    public static final String KEYWORD_PACKAGE = "package";
    public static final String KEYWORD_NAME = "name";
    public static final String KEYWORD_SHEET_ID = "spreadsheetId";
    public static final String KEYWORD_CLIENT_ID = "clientId";
    public static final String KEYWORD_CLIENT_SECRET = "clientSecret";
    public static final String KEYWORD_REFRESH_TOKEN = "refreshToken";

    public static final String CONFIG_SCRIPT_FILE = "Config.toml";
    public static final String PASSWORD = "password";
    public static final String USER = "user";
    public static final String MYSQL_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
    public static final String MSSQL_DRIVER_CLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static final String PERSIST_CONFIG_PATTERN = "persist.model.storage";
    public static final String SQL_SCHEMA_FILE = "script.sql";
    public static final String GOOGLE_SHEETS_SCHEMA_FILE = "script.gs";
    public static final String PERSIST_DIRECTORY = "persist";
    public static final String MIGRATIONS = "migrations";
    public static final String BALLERINA_MYSQL_DRIVER_NAME = "ballerinax/mysql.driver";
    public static final String BALLERINA_MSSQL_DRIVER_NAME = "ballerinax/mssql.driver";
    public static final String PLATFORM = "java11";
    public static final String PROPERTY_KEY_PATH = "path";
    public static final String MYSQL_CONNECTOR_NAME_PREFIX = "mysql-connector";
    public static final String MSSQL_CONNECTOR_NAME_PREFIX = "mssql-jdbc";
    public static final String SCHEMA_FILE_NAME = "model";
    public static final Set<String> SUPPORTED_DB_PROVIDERS =
           Set.of(SupportedDataSources.MYSQL_DB, SupportedDataSources.MSSQL_DB, SupportedDataSources.IN_MEMORY_TABLE,
                   SupportedDataSources.GOOGLE_SHEETS);

    /**
     * Constants related to Ballerina types.
     */
    public static final class BallerinaTypes {

        private BallerinaTypes() {}

        public static final String INT = "int";
        public static final String STRING = "string";
        public static final String BOOLEAN = "boolean";
        public static final String DECIMAL = "decimal";
        public static final String FLOAT = "float";
        public static final String DATE = "time:Date";
        public static final String TIME_OF_DAY = "time:TimeOfDay";
        public static final String UTC = "time:Utc";
        public static final String CIVIL = "time:Civil";
        public static final String BYTE = "byte";
    }

    /**
     * Constants related to SQL types.
     */
    public static final class SqlTypes {
        private SqlTypes() {}

        public static final String INT = "INT";
        public static final String BIT = "BIT";
        public static final String BOOLEAN = "BOOLEAN";
        public static final String DECIMAL = "DECIMAL";
        public static final String DOUBLE = "DOUBLE";
        public static final String FLOAT = "FLOAT";
        public static final String VARCHAR = "VARCHAR";
        public static final String DATE = "DATE";
        public static final String TIME = "TIME";
        public static final String TIME_STAMP = "TIMESTAMP";
        public static final String DATE_TIME = "DATETIME";
        public static final String DATE_TIME2 = "DATETIME2";
        public static final String LONG_BLOB = "LONGBLOB";
        public static final String VARBINARY = "VARBINARY(MAX)";
    }

    /**
     * Constants related to SQL script comments.
     */
    public static final class SqlScriptComments {
        private SqlScriptComments() {}

        public static final String AUTOGENERATED_FILE_COMMENT = "-- AUTO-GENERATED FILE.";

        public static final String AUTO_GENERATED_COMMENT_WITH_REASON =
                "-- This file is an auto-generated file by Ballerina persistence layer for %s.";
        public static final String COMMENT_SHOULD_BE_VERIFIED_AND_EXECUTED =
                "-- Please verify the generated scripts and execute them against the target DB server.";
    }

    /**
     * Constants related to AppScript script comments.
     */
    public static final class AppScriptComments {
        private AppScriptComments() {}

        public static final String AUTOGENERATED_FILE_COMMENT = "// AUTO-GENERATED FILE.";

        public static final String AUTO_GENERATED_COMMENT_WITH_REASON =
                "// This file is an auto-generated file by Ballerina persistence layer for %s.";
        public static final String COMMENT_SHOULD_BE_VERIFIED_AND_EXECUTED =
                "// Please verify the generated scripts and execute them against the target DB server.";
    }

    /**
     * Constants related to the length of SQL types.
     */
    public static final class DefaultMaxLength {

        private DefaultMaxLength() {}

        public static final int VARCHAR_LENGTH = 191;
        public static final int DECIMAL_PRECISION_MYSQL = 65;
        public static final int DECIMAL_PRECISION_MSSQL = 38;
        public static final int DECIMAL_SCALE = 30;
    }

    /**
     * Constants related to the ballerina.toml file.
     */
    public static final class TomlFileConstants {
        private TomlFileConstants() {}

        public static final String VERSION_PROPERTIES_FILE = "version.properties";
        public static final String KEYWORD_GROUP_ID = "groupId";
        public static final String PERSIST_GROUP_ID = "io.ballerina.stdlib";
        public static final String KEYWORD_ARTIFACT_ID = "artifactId";
        public static final String ARTIFACT_ID = "%s-native";
        public static final String PERSIST_SQL_VERSION = "persistSqlVersion";
        public static final String PERSIST_IN_MEMORY_VERSION = "persistInMemoryVersion";
        public static final String PERSIST_GOOGLE_SHEETS_VERSION = "persistGoogleSheetsVersion";
        public static final String KEYWORD_VERSION = "version";
    }

    /**
     * Constants related to the data sources.
     */
    public static final class SupportedDataSources {
        private SupportedDataSources() {}

        public static final String MYSQL_DB = "mysql";
        public static final String MSSQL_DB = "mssql";
        public static final String GOOGLE_SHEETS = "googlesheets";
        public static final String IN_MEMORY_TABLE = "inmemory";
    }

    /**
     * Constants related to the database configurations.
     */
    public static final class DBConfigs {

        private DBConfigs() {}

        public static final String KEY_USER = "user";
        public static final String KEY_PORT = "port";
        public static final String KEY_PASSWORD = "password";
        public static final String KEY_DATABASE = "database";
        public static final String KEY_HOST = "host";

        /**
         * Constants related to the MySQL configurations.
         */
        public static final class MySQL {
            private MySQL() {}

            public static final String DEFAULT_HOST = "localhost";
            public static final String DEFAULT_PORT = "3306";
            public static final String DEFAULT_USER = "root";

        }

        /**
         * Constants related to the MSSQL configurations.
         */
        public static final class MSSQL {
            private MSSQL() {}

            public static final String DEFAULT_HOST = "localhost";
            public static final String DEFAULT_PORT = "1433";
            public static final String DEFAULT_USER = "sa";

        }

    }
}
