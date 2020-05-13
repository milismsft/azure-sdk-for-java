/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.SqlResources;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.SqlDatabaseGetResults;
import java.util.List;
import rx.Completable;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.ThroughputSettingsGetResults;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.ThroughputSettingsUpdateParameters;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.SqlContainerGetResults;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.SqlStoredProcedureGetResults;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.SqlUserDefinedFunctionGetResults;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.SqlTriggerGetResults;

class SqlResourcesImpl extends WrapperImpl<SqlResourcesInner> implements SqlResources {
    private final CosmosDBManager manager;

    SqlResourcesImpl(CosmosDBManager manager) {
        super(manager.inner().sqlResources());
        this.manager = manager;
    }

    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public SqlDatabaseGetResultsImpl defineSqlDatabasis(String name) {
        return wrapSqlDatabasisModel(name);
    }

    @Override
    public SqlContainerGetResultsImpl defineContainer(String name) {
        return wrapContainerModel(name);
    }

    @Override
    public SqlStoredProcedureGetResultsImpl defineStoredProcedure(String name) {
        return wrapStoredProcedureModel(name);
    }

    @Override
    public SqlUserDefinedFunctionGetResultsImpl defineUserDefinedFunction(String name) {
        return wrapUserDefinedFunctionModel(name);
    }

    @Override
    public SqlTriggerGetResultsImpl defineTrigger(String name) {
        return wrapTriggerModel(name);
    }

    private SqlDatabaseGetResultsImpl wrapSqlDatabasisModel(String name) {
        return new SqlDatabaseGetResultsImpl(name, this.manager());
    }

    private SqlContainerGetResultsImpl wrapContainerModel(String name) {
        return new SqlContainerGetResultsImpl(name, this.manager());
    }

    private SqlStoredProcedureGetResultsImpl wrapStoredProcedureModel(String name) {
        return new SqlStoredProcedureGetResultsImpl(name, this.manager());
    }

    private SqlUserDefinedFunctionGetResultsImpl wrapUserDefinedFunctionModel(String name) {
        return new SqlUserDefinedFunctionGetResultsImpl(name, this.manager());
    }

    private SqlTriggerGetResultsImpl wrapTriggerModel(String name) {
        return new SqlTriggerGetResultsImpl(name, this.manager());
    }

    private SqlDatabaseGetResultsImpl wrapSqlDatabaseGetResultsModel(SqlDatabaseGetResultsInner inner) {
        return  new SqlDatabaseGetResultsImpl(inner, manager());
    }

    private SqlContainerGetResultsImpl wrapSqlContainerGetResultsModel(SqlContainerGetResultsInner inner) {
        return  new SqlContainerGetResultsImpl(inner, manager());
    }

    private SqlStoredProcedureGetResultsImpl wrapSqlStoredProcedureGetResultsModel(SqlStoredProcedureGetResultsInner inner) {
        return  new SqlStoredProcedureGetResultsImpl(inner, manager());
    }

    private SqlUserDefinedFunctionGetResultsImpl wrapSqlUserDefinedFunctionGetResultsModel(SqlUserDefinedFunctionGetResultsInner inner) {
        return  new SqlUserDefinedFunctionGetResultsImpl(inner, manager());
    }

    private SqlTriggerGetResultsImpl wrapSqlTriggerGetResultsModel(SqlTriggerGetResultsInner inner) {
        return  new SqlTriggerGetResultsImpl(inner, manager());
    }

    private Observable<SqlDatabaseGetResultsInner> getSqlDatabaseGetResultsInnerUsingSqlResourcesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String accountName = IdParsingUtils.getValueFromIdByName(id, "databaseAccounts");
        String databaseName = IdParsingUtils.getValueFromIdByName(id, "sqlDatabases");
        SqlResourcesInner client = this.inner();
        return client.getSqlDatabaseAsync(resourceGroupName, accountName, databaseName);
    }

    private Observable<SqlContainerGetResultsInner> getSqlContainerGetResultsInnerUsingSqlResourcesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String accountName = IdParsingUtils.getValueFromIdByName(id, "databaseAccounts");
        String databaseName = IdParsingUtils.getValueFromIdByName(id, "sqlDatabases");
        String containerName = IdParsingUtils.getValueFromIdByName(id, "containers");
        SqlResourcesInner client = this.inner();
        return client.getSqlContainerAsync(resourceGroupName, accountName, databaseName, containerName);
    }

    private Observable<SqlStoredProcedureGetResultsInner> getSqlStoredProcedureGetResultsInnerUsingSqlResourcesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String accountName = IdParsingUtils.getValueFromIdByName(id, "databaseAccounts");
        String databaseName = IdParsingUtils.getValueFromIdByName(id, "sqlDatabases");
        String containerName = IdParsingUtils.getValueFromIdByName(id, "containers");
        String storedProcedureName = IdParsingUtils.getValueFromIdByName(id, "storedProcedures");
        SqlResourcesInner client = this.inner();
        return client.getSqlStoredProcedureAsync(resourceGroupName, accountName, databaseName, containerName, storedProcedureName);
    }

    private Observable<SqlUserDefinedFunctionGetResultsInner> getSqlUserDefinedFunctionGetResultsInnerUsingSqlResourcesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String accountName = IdParsingUtils.getValueFromIdByName(id, "databaseAccounts");
        String databaseName = IdParsingUtils.getValueFromIdByName(id, "sqlDatabases");
        String containerName = IdParsingUtils.getValueFromIdByName(id, "containers");
        String userDefinedFunctionName = IdParsingUtils.getValueFromIdByName(id, "userDefinedFunctions");
        SqlResourcesInner client = this.inner();
        return client.getSqlUserDefinedFunctionAsync(resourceGroupName, accountName, databaseName, containerName, userDefinedFunctionName);
    }

    private Observable<SqlTriggerGetResultsInner> getSqlTriggerGetResultsInnerUsingSqlResourcesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String accountName = IdParsingUtils.getValueFromIdByName(id, "databaseAccounts");
        String databaseName = IdParsingUtils.getValueFromIdByName(id, "sqlDatabases");
        String containerName = IdParsingUtils.getValueFromIdByName(id, "containers");
        String triggerName = IdParsingUtils.getValueFromIdByName(id, "triggers");
        SqlResourcesInner client = this.inner();
        return client.getSqlTriggerAsync(resourceGroupName, accountName, databaseName, containerName, triggerName);
    }

    @Override
    public Observable<SqlDatabaseGetResults> getSqlDatabaseAsync(String resourceGroupName, String accountName, String databaseName) {
        SqlResourcesInner client = this.inner();
        return client.getSqlDatabaseAsync(resourceGroupName, accountName, databaseName)
        .flatMap(new Func1<SqlDatabaseGetResultsInner, Observable<SqlDatabaseGetResults>>() {
            @Override
            public Observable<SqlDatabaseGetResults> call(SqlDatabaseGetResultsInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((SqlDatabaseGetResults)wrapSqlDatabaseGetResultsModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<SqlDatabaseGetResults> listSqlDatabasesAsync(String resourceGroupName, String accountName) {
        SqlResourcesInner client = this.inner();
        return client.listSqlDatabasesAsync(resourceGroupName, accountName)
        .flatMap(new Func1<List<SqlDatabaseGetResultsInner>, Observable<SqlDatabaseGetResultsInner>>() {
            @Override
            public Observable<SqlDatabaseGetResultsInner> call(List<SqlDatabaseGetResultsInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<SqlDatabaseGetResultsInner, SqlDatabaseGetResults>() {
            @Override
            public SqlDatabaseGetResults call(SqlDatabaseGetResultsInner inner) {
                return wrapSqlDatabaseGetResultsModel(inner);
            }
        });
    }

    @Override
    public Completable deleteSqlDatabaseAsync(String resourceGroupName, String accountName, String databaseName) {
        SqlResourcesInner client = this.inner();
        return client.deleteSqlDatabaseAsync(resourceGroupName, accountName, databaseName).toCompletable();
    }

    @Override
    public Observable<ThroughputSettingsGetResults> getSqlDatabaseThroughputAsync(String resourceGroupName, String accountName, String databaseName) {
        SqlResourcesInner client = this.inner();
        return client.getSqlDatabaseThroughputAsync(resourceGroupName, accountName, databaseName)
        .map(new Func1<ThroughputSettingsGetResultsInner, ThroughputSettingsGetResults>() {
            @Override
            public ThroughputSettingsGetResults call(ThroughputSettingsGetResultsInner inner) {
                return new ThroughputSettingsGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ThroughputSettingsGetResults> updateSqlDatabaseThroughputAsync(String resourceGroupName, String accountName, String databaseName, ThroughputSettingsUpdateParameters updateThroughputParameters) {
        SqlResourcesInner client = this.inner();
        return client.updateSqlDatabaseThroughputAsync(resourceGroupName, accountName, databaseName, updateThroughputParameters)
        .map(new Func1<ThroughputSettingsGetResultsInner, ThroughputSettingsGetResults>() {
            @Override
            public ThroughputSettingsGetResults call(ThroughputSettingsGetResultsInner inner) {
                return new ThroughputSettingsGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ThroughputSettingsGetResults> getSqlContainerThroughputAsync(String resourceGroupName, String accountName, String databaseName, String containerName) {
        SqlResourcesInner client = this.inner();
        return client.getSqlContainerThroughputAsync(resourceGroupName, accountName, databaseName, containerName)
        .map(new Func1<ThroughputSettingsGetResultsInner, ThroughputSettingsGetResults>() {
            @Override
            public ThroughputSettingsGetResults call(ThroughputSettingsGetResultsInner inner) {
                return new ThroughputSettingsGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ThroughputSettingsGetResults> updateSqlContainerThroughputAsync(String resourceGroupName, String accountName, String databaseName, String containerName, ThroughputSettingsUpdateParameters updateThroughputParameters) {
        SqlResourcesInner client = this.inner();
        return client.updateSqlContainerThroughputAsync(resourceGroupName, accountName, databaseName, containerName, updateThroughputParameters)
        .map(new Func1<ThroughputSettingsGetResultsInner, ThroughputSettingsGetResults>() {
            @Override
            public ThroughputSettingsGetResults call(ThroughputSettingsGetResultsInner inner) {
                return new ThroughputSettingsGetResultsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SqlContainerGetResults> getSqlContainerAsync(String resourceGroupName, String accountName, String databaseName, String containerName) {
        SqlResourcesInner client = this.inner();
        return client.getSqlContainerAsync(resourceGroupName, accountName, databaseName, containerName)
        .flatMap(new Func1<SqlContainerGetResultsInner, Observable<SqlContainerGetResults>>() {
            @Override
            public Observable<SqlContainerGetResults> call(SqlContainerGetResultsInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((SqlContainerGetResults)wrapSqlContainerGetResultsModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<SqlContainerGetResults> listSqlContainersAsync(String resourceGroupName, String accountName, String databaseName) {
        SqlResourcesInner client = this.inner();
        return client.listSqlContainersAsync(resourceGroupName, accountName, databaseName)
        .flatMap(new Func1<List<SqlContainerGetResultsInner>, Observable<SqlContainerGetResultsInner>>() {
            @Override
            public Observable<SqlContainerGetResultsInner> call(List<SqlContainerGetResultsInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<SqlContainerGetResultsInner, SqlContainerGetResults>() {
            @Override
            public SqlContainerGetResults call(SqlContainerGetResultsInner inner) {
                return wrapSqlContainerGetResultsModel(inner);
            }
        });
    }

    @Override
    public Completable deleteSqlContainerAsync(String resourceGroupName, String accountName, String databaseName, String containerName) {
        SqlResourcesInner client = this.inner();
        return client.deleteSqlContainerAsync(resourceGroupName, accountName, databaseName, containerName).toCompletable();
    }

    @Override
    public Observable<SqlStoredProcedureGetResults> getSqlStoredProcedureAsync(String resourceGroupName, String accountName, String databaseName, String containerName, String storedProcedureName) {
        SqlResourcesInner client = this.inner();
        return client.getSqlStoredProcedureAsync(resourceGroupName, accountName, databaseName, containerName, storedProcedureName)
        .flatMap(new Func1<SqlStoredProcedureGetResultsInner, Observable<SqlStoredProcedureGetResults>>() {
            @Override
            public Observable<SqlStoredProcedureGetResults> call(SqlStoredProcedureGetResultsInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((SqlStoredProcedureGetResults)wrapSqlStoredProcedureGetResultsModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<SqlStoredProcedureGetResults> listSqlStoredProceduresAsync(String resourceGroupName, String accountName, String databaseName, String containerName) {
        SqlResourcesInner client = this.inner();
        return client.listSqlStoredProceduresAsync(resourceGroupName, accountName, databaseName, containerName)
        .flatMap(new Func1<List<SqlStoredProcedureGetResultsInner>, Observable<SqlStoredProcedureGetResultsInner>>() {
            @Override
            public Observable<SqlStoredProcedureGetResultsInner> call(List<SqlStoredProcedureGetResultsInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<SqlStoredProcedureGetResultsInner, SqlStoredProcedureGetResults>() {
            @Override
            public SqlStoredProcedureGetResults call(SqlStoredProcedureGetResultsInner inner) {
                return wrapSqlStoredProcedureGetResultsModel(inner);
            }
        });
    }

    @Override
    public Completable deleteSqlStoredProcedureAsync(String resourceGroupName, String accountName, String databaseName, String containerName, String storedProcedureName) {
        SqlResourcesInner client = this.inner();
        return client.deleteSqlStoredProcedureAsync(resourceGroupName, accountName, databaseName, containerName, storedProcedureName).toCompletable();
    }

    @Override
    public Observable<SqlUserDefinedFunctionGetResults> getSqlUserDefinedFunctionAsync(String resourceGroupName, String accountName, String databaseName, String containerName, String userDefinedFunctionName) {
        SqlResourcesInner client = this.inner();
        return client.getSqlUserDefinedFunctionAsync(resourceGroupName, accountName, databaseName, containerName, userDefinedFunctionName)
        .flatMap(new Func1<SqlUserDefinedFunctionGetResultsInner, Observable<SqlUserDefinedFunctionGetResults>>() {
            @Override
            public Observable<SqlUserDefinedFunctionGetResults> call(SqlUserDefinedFunctionGetResultsInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((SqlUserDefinedFunctionGetResults)wrapSqlUserDefinedFunctionGetResultsModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<SqlUserDefinedFunctionGetResults> listSqlUserDefinedFunctionsAsync(String resourceGroupName, String accountName, String databaseName, String containerName) {
        SqlResourcesInner client = this.inner();
        return client.listSqlUserDefinedFunctionsAsync(resourceGroupName, accountName, databaseName, containerName)
        .flatMap(new Func1<List<SqlUserDefinedFunctionGetResultsInner>, Observable<SqlUserDefinedFunctionGetResultsInner>>() {
            @Override
            public Observable<SqlUserDefinedFunctionGetResultsInner> call(List<SqlUserDefinedFunctionGetResultsInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<SqlUserDefinedFunctionGetResultsInner, SqlUserDefinedFunctionGetResults>() {
            @Override
            public SqlUserDefinedFunctionGetResults call(SqlUserDefinedFunctionGetResultsInner inner) {
                return wrapSqlUserDefinedFunctionGetResultsModel(inner);
            }
        });
    }

    @Override
    public Completable deleteSqlUserDefinedFunctionAsync(String resourceGroupName, String accountName, String databaseName, String containerName, String userDefinedFunctionName) {
        SqlResourcesInner client = this.inner();
        return client.deleteSqlUserDefinedFunctionAsync(resourceGroupName, accountName, databaseName, containerName, userDefinedFunctionName).toCompletable();
    }

    @Override
    public Observable<SqlTriggerGetResults> getSqlTriggerAsync(String resourceGroupName, String accountName, String databaseName, String containerName, String triggerName) {
        SqlResourcesInner client = this.inner();
        return client.getSqlTriggerAsync(resourceGroupName, accountName, databaseName, containerName, triggerName)
        .flatMap(new Func1<SqlTriggerGetResultsInner, Observable<SqlTriggerGetResults>>() {
            @Override
            public Observable<SqlTriggerGetResults> call(SqlTriggerGetResultsInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((SqlTriggerGetResults)wrapSqlTriggerGetResultsModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<SqlTriggerGetResults> listSqlTriggersAsync(String resourceGroupName, String accountName, String databaseName, String containerName) {
        SqlResourcesInner client = this.inner();
        return client.listSqlTriggersAsync(resourceGroupName, accountName, databaseName, containerName)
        .flatMap(new Func1<List<SqlTriggerGetResultsInner>, Observable<SqlTriggerGetResultsInner>>() {
            @Override
            public Observable<SqlTriggerGetResultsInner> call(List<SqlTriggerGetResultsInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<SqlTriggerGetResultsInner, SqlTriggerGetResults>() {
            @Override
            public SqlTriggerGetResults call(SqlTriggerGetResultsInner inner) {
                return wrapSqlTriggerGetResultsModel(inner);
            }
        });
    }

    @Override
    public Completable deleteSqlTriggerAsync(String resourceGroupName, String accountName, String databaseName, String containerName, String triggerName) {
        SqlResourcesInner client = this.inner();
        return client.deleteSqlTriggerAsync(resourceGroupName, accountName, databaseName, containerName, triggerName).toCompletable();
    }

}
